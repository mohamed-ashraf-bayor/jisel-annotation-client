package com.bayor.jisel.annotation.client.unsealanddetach;

import com.bayor.jisel.annotation.client.multilevel.Drivable;
import com.bayor.jisel.annotation.client.singlelevelandhierarchical.Processor;
import org.jisel.annotations.Detach;
import org.jisel.annotations.DetachAll;
import org.jisel.annotations.SealFor;
import org.jisel.annotations.TopLevel;
import org.jisel.annotations.UnSeal;

import java.io.Serial;
import java.util.List;

import static com.bayor.jisel.annotation.client.unsealanddetach.Sociable.ACTIVE_WORKER;
import static com.bayor.jisel.annotation.client.unsealanddetach.Sociable.STUDENT;
import static com.bayor.jisel.annotation.client.unsealanddetach.Sociable.TOP_LEVEL_KEYWORD;

@UnSeal
@DetachAll // works independently from @UnSeal and @Detach annotations. Detaches all profiles and generates each one as independent interfaces
@Detach(profile = TOP_LEVEL_KEYWORD) // 'rename' attribute not specified, generated interface will be named "Sociable" (which in this example, is the top-level profile)
@Detach(
        profile = ACTIVE_WORKER,
        rename = ACTIVE_WORKER + "With2SuperInterfaces",
        superInterfaces = {Processor.class, Drivable.class},
        applyAnnotations = """
                @java.lang.Deprecated
                @java.lang.SuppressWarnings({"unchecked", "deprecation", "unused", "testing", "anotherTestValue"})
                @javax.annotation.processing.SupportedOptions("")
                @javax.annotation.processing.SupportedAnnotationTypes("type1")
                """
)
@Detach(profile = STUDENT, rename = "DeprecatedStudent", applyAnnotations = "@java.lang.Deprecated")
public interface Sociable {

    String TOP_LEVEL_KEYWORD = "(toplevel)"; // "(toplevel)" is a keyword used to tell Jisel to detach the top-level profile
    String STUDENT = "Student";
    String WORKER = "Worker";
    String ACTIVE_WORKER = "ActiveWorker";

    @TopLevel
    String startConversation() throws IllegalStateException;

    @SealFor(STUDENT)
    boolean attendClass(String fieldOfStudy) throws IllegalArgumentException;

    @SealFor(STUDENT)
    void askForHelpWhenNeeded();

    @SealFor({WORKER, ACTIVE_WORKER})
    boolean[] joinOfficeSocialGroups(@SuppressWarnings("unused") String[] groups, @SuppressWarnings("unchecked") int maximum);

    @SealFor(ACTIVE_WORKER)
    @Deprecated
    void leadOfficeSocialGroup(@SuppressWarnings({"unchecked", "deprecation", "unused"}) String groupName);

    @SealFor(ACTIVE_WORKER)
    @Serial
    @Deprecated
    double createNewOfficeSocialGroup(String groupName, List<String> starters) throws ArithmeticException;
}