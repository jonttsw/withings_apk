package com.withings.programs.model.program;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.contentproviders.model.content.ContentAccessLevel;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.CurrentWeekAndDay;
import com.withings.programs.model.enrolled.EnrolledDetail;
import com.withings.programs.model.programoverview.ProgramOverview;
import com.withings.programs.model.taskpreview.TaskPreview;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import sm0.a;
import sm0.b;
/* compiled from: ProgramDomain.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 D2\u00020\u0001:\u0003DEFB\u0089\u0001\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u0017\u0010;\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0002\u0010=J\u0019\u0010>\u001a\u0004\u0018\u00010$2\b\u0010<\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0002\u0010?J\u0016\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\rR\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\rX¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u0004\u0018\u00010$X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0014\u0010\u0016\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00102R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0014\u0010\u000f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010*R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u00102\u0082\u0001\u0002GH¨\u0006I"}, d2 = {"Lcom/withings/programs/model/program/ProgramDomain;", "", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "", "currentWeekAndDay", "Lcom/withings/programs/model/CurrentWeekAndDay;", "deployment", "", "enrolled", "Lcom/withings/programs/model/enrolled/EnrolledDetail;", "familyId", "modified", NavigationArguments.PROGRAM_ID, "", "targetType", "targetValue", "visible", "", "countryCodes", "", "eligibility", "Lcom/withings/programs/model/program/EligibilityDomain;", "isSuggested", "accessLevel", "Lcom/withings/contentproviders/model/content/ContentAccessLevel;", "(JLcom/withings/programs/model/CurrentWeekAndDay;Ljava/lang/String;Lcom/withings/programs/model/enrolled/EnrolledDetail;Ljava/lang/Long;JIILjava/lang/String;ZLjava/util/List;Lcom/withings/programs/model/program/EligibilityDomain;ZLcom/withings/contentproviders/model/content/ContentAccessLevel;)V", "getAccessLevel", "()Lcom/withings/contentproviders/model/content/ContentAccessLevel;", "computedDuration", "getComputedDuration", "()Ljava/lang/Integer;", "getCountryCodes", "()Ljava/util/List;", "getCreated", "()J", "currentStepProgression", "", "getCurrentStepProgression", "()Ljava/lang/Float;", "getCurrentWeekAndDay", "()Lcom/withings/programs/model/CurrentWeekAndDay;", "getDeployment", "()Ljava/lang/String;", "getEligibility", "()Lcom/withings/programs/model/program/EligibilityDomain;", "getEnrolled", "()Lcom/withings/programs/model/enrolled/EnrolledDetail;", "getFamilyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "getModified", "getProgramId", "()I", "progress", "getProgress", "getTargetType", "getTargetValue", "getVisible", "retrieveComputedDuration", ValidateElement.RangeValidateElement.METHOD, "(Ljava/lang/Integer;)I", "retrieveStepProgression", "(Ljava/lang/Integer;)Ljava/lang/Float;", "retrieveTaskDate", "Lcom/withings/programs/model/program/ProgramDomain$Companion$TaskDate;", "weekIndex", "dayIndex", "Companion", "LegacyDomain", "WifitDomain", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "Lcom/withings/programs/model/program/ProgramDomain$WifitDomain;", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProgramDomain {
    public static final Companion Companion = new Companion(null);
    private static final int WEEKS_PER_MONTH = 4;
    private final ContentAccessLevel accessLevel;
    private final List<String> countryCodes;
    private final long created;
    private final CurrentWeekAndDay currentWeekAndDay;
    private final String deployment;
    private final EligibilityDomain eligibility;
    private final EnrolledDetail enrolled;
    private final Long familyId;
    private final boolean isSuggested;
    private final long modified;
    private final int programId;
    private final int targetType;
    private final String targetValue;
    private final boolean visible;

    /* compiled from: ProgramDomain.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/program/ProgramDomain$Companion;", "", "()V", "WEEKS_PER_MONTH", "", "TaskDate", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ProgramDomain.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/programs/model/program/ProgramDomain$Companion$TaskDate;", "", "(Ljava/lang/String;I)V", "FUTURE", "TODAY", "PAST", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class TaskDate {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ TaskDate[] $VALUES;
            public static final TaskDate FUTURE = new TaskDate("FUTURE", 0);
            public static final TaskDate TODAY = new TaskDate("TODAY", 1);
            public static final TaskDate PAST = new TaskDate("PAST", 2);

            private static final /* synthetic */ TaskDate[] $values() {
                return new TaskDate[]{FUTURE, TODAY, PAST};
            }

            static {
                TaskDate[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private TaskDate(String str, int i11) {
            }

            public static a<TaskDate> getEntries() {
                return $ENTRIES;
            }

            public static TaskDate valueOf(String str) {
                return (TaskDate) Enum.valueOf(TaskDate.class, str);
            }

            public static TaskDate[] values() {
                return (TaskDate[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: ProgramDomain.kt */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b.\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003J\t\u0010B\u001a\u00020\u0004HÆ\u0003J\t\u0010C\u001a\u00020\u0015HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010E\u001a\u00020\u0019HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\u0004HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010J\u001a\u00020\rHÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00102J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0011HÆ\u0003J¨\u0001\u0010N\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÆ\u0001¢\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020\u00152\b\u0010Q\u001a\u0004\u0018\u00010RHÖ\u0003J\t\u0010S\u001a\u00020\u0011HÖ\u0001J\t\u0010T\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u001b\u001a\u00020\u0011X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010#X\u0096\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u0011X\u0096\u0004¢\u0006\n\n\u0002\u00109\u001a\u0004\b8\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010\u0012\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0014\u0010\u0013\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010*R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?¨\u0006U"}, d2 = {"Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "Lcom/withings/programs/model/program/ProgramDomain;", "countryCodes", "", "", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "", "currentWeekAndDay", "Lcom/withings/programs/model/CurrentWeekAndDay;", "deployment", "eligibility", "Lcom/withings/programs/model/program/EligibilityDomain;", "enrolled", "Lcom/withings/programs/model/enrolled/EnrolledDetail;", "familyId", "modified", NavigationArguments.PROGRAM_ID, "", "targetType", "targetValue", "visible", "", "durationJson", "Lcom/withings/programs/model/program/DurationDomain;", "specifics", "Lcom/withings/programs/model/program/SpecificsDomain;", "(Ljava/util/List;JLcom/withings/programs/model/CurrentWeekAndDay;Ljava/lang/String;Lcom/withings/programs/model/program/EligibilityDomain;Lcom/withings/programs/model/enrolled/EnrolledDetail;Ljava/lang/Long;JIILjava/lang/String;ZLcom/withings/programs/model/program/DurationDomain;Lcom/withings/programs/model/program/SpecificsDomain;)V", "computedDuration", "getComputedDuration", "()Ljava/lang/Integer;", "getCountryCodes", "()Ljava/util/List;", "getCreated", "()J", "currentStepProgression", "", "getCurrentStepProgression", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCurrentWeekAndDay", "()Lcom/withings/programs/model/CurrentWeekAndDay;", "getDeployment", "()Ljava/lang/String;", "getDurationJson", "()Lcom/withings/programs/model/program/DurationDomain;", "getEligibility", "()Lcom/withings/programs/model/program/EligibilityDomain;", "getEnrolled", "()Lcom/withings/programs/model/enrolled/EnrolledDetail;", "getFamilyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getModified", "getProgramId", "()I", "progress", "getProgress", "Ljava/lang/Integer;", "getSpecifics", "()Lcom/withings/programs/model/program/SpecificsDomain;", "getTargetType", "getTargetValue", "getVisible", "()Z", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;JLcom/withings/programs/model/CurrentWeekAndDay;Ljava/lang/String;Lcom/withings/programs/model/program/EligibilityDomain;Lcom/withings/programs/model/enrolled/EnrolledDetail;Ljava/lang/Long;JIILjava/lang/String;ZLcom/withings/programs/model/program/DurationDomain;Lcom/withings/programs/model/program/SpecificsDomain;)Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "equals", "other", "", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LegacyDomain extends ProgramDomain {
        private final int computedDuration;
        private final List<String> countryCodes;
        private final long created;
        private final Float currentStepProgression;
        private final CurrentWeekAndDay currentWeekAndDay;
        private final String deployment;
        private final DurationDomain durationJson;
        private final EligibilityDomain eligibility;
        private final EnrolledDetail enrolled;
        private final Long familyId;
        private final long modified;
        private final int programId;
        private final Integer progress;
        private final SpecificsDomain specifics;
        private final int targetType;
        private final String targetValue;
        private final boolean visible;

        public /* synthetic */ LegacyDomain(List list, long j5, CurrentWeekAndDay currentWeekAndDay, String str, EligibilityDomain eligibilityDomain, EnrolledDetail enrolledDetail, Long l5, long j11, int i11, int i12, String str2, boolean z5, DurationDomain durationDomain, SpecificsDomain specificsDomain, int i13, m mVar) {
            this((i13 & 1) != 0 ? null : list, j5, currentWeekAndDay, str, (i13 & 16) != 0 ? null : eligibilityDomain, enrolledDetail, l5, j11, i11, i12, str2, z5, (i13 & 4096) != 0 ? null : durationDomain, specificsDomain);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LegacyDomain copy$default(LegacyDomain legacyDomain, List list, long j5, CurrentWeekAndDay currentWeekAndDay, String str, EligibilityDomain eligibilityDomain, EnrolledDetail enrolledDetail, Long l5, long j11, int i11, int i12, String str2, boolean z5, DurationDomain durationDomain, SpecificsDomain specificsDomain, int i13, Object obj) {
            List<String> list2;
            long j12;
            CurrentWeekAndDay currentWeekAndDay2;
            String str3;
            EligibilityDomain eligibilityDomain2;
            EnrolledDetail enrolledDetail2;
            Long l6;
            long j13;
            int i14;
            int i15;
            String str4;
            boolean z11;
            DurationDomain durationDomain2;
            SpecificsDomain specificsDomain2;
            if ((i13 & 1) != 0) {
                list2 = legacyDomain.countryCodes;
            } else {
                list2 = list;
            }
            if ((i13 & 2) != 0) {
                j12 = legacyDomain.created;
            } else {
                j12 = j5;
            }
            if ((i13 & 4) != 0) {
                currentWeekAndDay2 = legacyDomain.currentWeekAndDay;
            } else {
                currentWeekAndDay2 = currentWeekAndDay;
            }
            if ((i13 & 8) != 0) {
                str3 = legacyDomain.deployment;
            } else {
                str3 = str;
            }
            if ((i13 & 16) != 0) {
                eligibilityDomain2 = legacyDomain.eligibility;
            } else {
                eligibilityDomain2 = eligibilityDomain;
            }
            if ((i13 & 32) != 0) {
                enrolledDetail2 = legacyDomain.enrolled;
            } else {
                enrolledDetail2 = enrolledDetail;
            }
            if ((i13 & 64) != 0) {
                l6 = legacyDomain.familyId;
            } else {
                l6 = l5;
            }
            if ((i13 & 128) != 0) {
                j13 = legacyDomain.modified;
            } else {
                j13 = j11;
            }
            if ((i13 & 256) != 0) {
                i14 = legacyDomain.programId;
            } else {
                i14 = i11;
            }
            if ((i13 & 512) != 0) {
                i15 = legacyDomain.targetType;
            } else {
                i15 = i12;
            }
            if ((i13 & 1024) != 0) {
                str4 = legacyDomain.targetValue;
            } else {
                str4 = str2;
            }
            if ((i13 & ModuleCopy.f28574b) != 0) {
                z11 = legacyDomain.visible;
            } else {
                z11 = z5;
            }
            boolean z12 = z11;
            if ((i13 & 4096) != 0) {
                durationDomain2 = legacyDomain.durationJson;
            } else {
                durationDomain2 = durationDomain;
            }
            if ((i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                specificsDomain2 = legacyDomain.specifics;
            } else {
                specificsDomain2 = specificsDomain;
            }
            return legacyDomain.copy(list2, j12, currentWeekAndDay2, str3, eligibilityDomain2, enrolledDetail2, l6, j13, i14, i15, str4, z12, durationDomain2, specificsDomain2);
        }

        public final List<String> component1() {
            return this.countryCodes;
        }

        public final int component10() {
            return this.targetType;
        }

        public final String component11() {
            return this.targetValue;
        }

        public final boolean component12() {
            return this.visible;
        }

        public final DurationDomain component13() {
            return this.durationJson;
        }

        public final SpecificsDomain component14() {
            return this.specifics;
        }

        public final long component2() {
            return this.created;
        }

        public final CurrentWeekAndDay component3() {
            return this.currentWeekAndDay;
        }

        public final String component4() {
            return this.deployment;
        }

        public final EligibilityDomain component5() {
            return this.eligibility;
        }

        public final EnrolledDetail component6() {
            return this.enrolled;
        }

        public final Long component7() {
            return this.familyId;
        }

        public final long component8() {
            return this.modified;
        }

        public final int component9() {
            return this.programId;
        }

        public final LegacyDomain copy(List<String> list, long j5, CurrentWeekAndDay currentWeekAndDay, String deployment, EligibilityDomain eligibilityDomain, EnrolledDetail enrolled, Long l5, long j11, int i11, int i12, String targetValue, boolean z5, DurationDomain durationDomain, SpecificsDomain specifics) {
            u.j(currentWeekAndDay, "currentWeekAndDay");
            u.j(deployment, "deployment");
            u.j(enrolled, "enrolled");
            u.j(targetValue, "targetValue");
            u.j(specifics, "specifics");
            return new LegacyDomain(list, j5, currentWeekAndDay, deployment, eligibilityDomain, enrolled, l5, j11, i11, i12, targetValue, z5, durationDomain, specifics);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LegacyDomain)) {
                return false;
            }
            LegacyDomain legacyDomain = (LegacyDomain) obj;
            if (u.e(this.countryCodes, legacyDomain.countryCodes) && this.created == legacyDomain.created && u.e(this.currentWeekAndDay, legacyDomain.currentWeekAndDay) && u.e(this.deployment, legacyDomain.deployment) && u.e(this.eligibility, legacyDomain.eligibility) && u.e(this.enrolled, legacyDomain.enrolled) && u.e(this.familyId, legacyDomain.familyId) && this.modified == legacyDomain.modified && this.programId == legacyDomain.programId && this.targetType == legacyDomain.targetType && u.e(this.targetValue, legacyDomain.targetValue) && this.visible == legacyDomain.visible && u.e(this.durationJson, legacyDomain.durationJson) && u.e(this.specifics, legacyDomain.specifics)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        protected Integer getComputedDuration() {
            return Integer.valueOf(this.computedDuration);
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public List<String> getCountryCodes() {
            return this.countryCodes;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public long getCreated() {
            return this.created;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public Float getCurrentStepProgression() {
            return this.currentStepProgression;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public CurrentWeekAndDay getCurrentWeekAndDay() {
            return this.currentWeekAndDay;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public String getDeployment() {
            return this.deployment;
        }

        public final DurationDomain getDurationJson() {
            return this.durationJson;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public EligibilityDomain getEligibility() {
            return this.eligibility;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public EnrolledDetail getEnrolled() {
            return this.enrolled;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public Long getFamilyId() {
            return this.familyId;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public long getModified() {
            return this.modified;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public int getProgramId() {
            return this.programId;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public Integer getProgress() {
            return this.progress;
        }

        public final SpecificsDomain getSpecifics() {
            return this.specifics;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public int getTargetType() {
            return this.targetType;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public String getTargetValue() {
            return this.targetValue;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            List<String> list = this.countryCodes;
            int i11 = 0;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            int c11 = d.c(this.deployment, (this.currentWeekAndDay.hashCode() + c.a(this.created, hashCode * 31, 31)) * 31, 31);
            EligibilityDomain eligibilityDomain = this.eligibility;
            if (eligibilityDomain == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = eligibilityDomain.hashCode();
            }
            int hashCode4 = (this.enrolled.hashCode() + ((c11 + hashCode2) * 31)) * 31;
            Long l5 = this.familyId;
            if (l5 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = l5.hashCode();
            }
            int a11 = y1.a(this.visible, d.c(this.targetValue, h.a(this.targetType, h.a(this.programId, c.a(this.modified, (hashCode4 + hashCode3) * 31, 31), 31), 31), 31), 31);
            DurationDomain durationDomain = this.durationJson;
            if (durationDomain != null) {
                i11 = durationDomain.hashCode();
            }
            return this.specifics.hashCode() + ((a11 + i11) * 31);
        }

        public String toString() {
            List<String> list = this.countryCodes;
            long j5 = this.created;
            CurrentWeekAndDay currentWeekAndDay = this.currentWeekAndDay;
            String str = this.deployment;
            EligibilityDomain eligibilityDomain = this.eligibility;
            EnrolledDetail enrolledDetail = this.enrolled;
            Long l5 = this.familyId;
            long j11 = this.modified;
            int i11 = this.programId;
            int i12 = this.targetType;
            String str2 = this.targetValue;
            boolean z5 = this.visible;
            DurationDomain durationDomain = this.durationJson;
            SpecificsDomain specificsDomain = this.specifics;
            return "LegacyDomain(countryCodes=" + list + ", created=" + j5 + ", currentWeekAndDay=" + currentWeekAndDay + ", deployment=" + str + ", eligibility=" + eligibilityDomain + ", enrolled=" + enrolledDetail + ", familyId=" + l5 + ", modified=" + j11 + ", programId=" + i11 + ", targetType=" + i12 + ", targetValue=" + str2 + ", visible=" + z5 + ", durationJson=" + durationDomain + ", specifics=" + specificsDomain + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegacyDomain(List<String> list, long j5, CurrentWeekAndDay currentWeekAndDay, String deployment, EligibilityDomain eligibilityDomain, EnrolledDetail enrolled, Long l5, long j11, int i11, int i12, String targetValue, boolean z5, DurationDomain durationDomain, SpecificsDomain specifics) {
            super(j5, currentWeekAndDay, deployment, enrolled, l5, j11, i11, i12, targetValue, z5, list, eligibilityDomain, false, ContentAccessLevel.f35292d, 4096, null);
            u.j(currentWeekAndDay, "currentWeekAndDay");
            u.j(deployment, "deployment");
            u.j(enrolled, "enrolled");
            u.j(targetValue, "targetValue");
            u.j(specifics, "specifics");
            this.countryCodes = list;
            this.created = j5;
            this.currentWeekAndDay = currentWeekAndDay;
            this.deployment = deployment;
            this.eligibility = eligibilityDomain;
            this.enrolled = enrolled;
            this.familyId = l5;
            this.modified = j11;
            this.programId = i11;
            this.targetType = i12;
            this.targetValue = targetValue;
            this.visible = z5;
            this.durationJson = durationDomain;
            this.specifics = specifics;
            this.computedDuration = retrieveComputedDuration(durationDomain != null ? Integer.valueOf(durationDomain.getRange()) : null);
            Integer computedDuration = getComputedDuration();
            this.progress = computedDuration.intValue() < 0 ? null : computedDuration;
            this.currentStepProgression = retrieveStepProgression(durationDomain != null ? Integer.valueOf(durationDomain.getRange()) : null);
        }
    }

    /* compiled from: ProgramDomain.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0011HÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003J\t\u0010J\u001a\u00020\u0015HÆ\u0003J\t\u0010K\u001a\u00020\u0017HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0015HÆ\u0003J\t\u0010O\u001a\u00020\u001eHÆ\u0003J\t\u0010P\u001a\u00020\u0006HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\u0004HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010T\u001a\u00020\rHÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u00109J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\t\u0010W\u001a\u00020\u0011HÆ\u0003JÎ\u0001\u0010X\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u001d\u001a\u00020\u001eHÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020\u00152\b\u0010[\u001a\u0004\u0018\u00010\\HÖ\u0003J\t\u0010]\u001a\u00020\u0011HÖ\u0001J\t\u0010^\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u0011X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010*X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010:\u001a\u0004\b8\u00109R\u0014\u0010\u001c\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010;R\u0014\u0010\u000f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010$R\u0014\u0010\u0012\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010>R\u0014\u0010\u0013\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010&R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010;¨\u0006_"}, d2 = {"Lcom/withings/programs/model/program/ProgramDomain$WifitDomain;", "Lcom/withings/programs/model/program/ProgramDomain;", "countryCodes", "", "", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "", "currentWeekAndDay", "Lcom/withings/programs/model/CurrentWeekAndDay;", "deployment", "eligibility", "Lcom/withings/programs/model/program/EligibilityDomain;", "enrolled", "Lcom/withings/programs/model/enrolled/EnrolledDetail;", "familyId", "modified", NavigationArguments.PROGRAM_ID, "", "targetType", "targetValue", "visible", "", "data", "Lcom/withings/programs/model/program/DataDomain;", "programOverview", "Lcom/withings/programs/model/programoverview/ProgramOverview;", "tasksPreview", "Lcom/withings/programs/model/taskpreview/TaskPreview;", "isSuggested", "accessLevel", "Lcom/withings/contentproviders/model/content/ContentAccessLevel;", "(Ljava/util/List;JLcom/withings/programs/model/CurrentWeekAndDay;Ljava/lang/String;Lcom/withings/programs/model/program/EligibilityDomain;Lcom/withings/programs/model/enrolled/EnrolledDetail;Ljava/lang/Long;JIILjava/lang/String;ZLcom/withings/programs/model/program/DataDomain;Lcom/withings/programs/model/programoverview/ProgramOverview;Ljava/util/List;ZLcom/withings/contentproviders/model/content/ContentAccessLevel;)V", "getAccessLevel", "()Lcom/withings/contentproviders/model/content/ContentAccessLevel;", "computedDuration", "getComputedDuration", "()Ljava/lang/Integer;", "getCountryCodes", "()Ljava/util/List;", "getCreated", "()J", "currentStepProgression", "", "getCurrentStepProgression", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCurrentWeekAndDay", "()Lcom/withings/programs/model/CurrentWeekAndDay;", "getData", "()Lcom/withings/programs/model/program/DataDomain;", "getDeployment", "()Ljava/lang/String;", "getEligibility", "()Lcom/withings/programs/model/program/EligibilityDomain;", "getEnrolled", "()Lcom/withings/programs/model/enrolled/EnrolledDetail;", "getFamilyId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Z", "getModified", "getProgramId", "()I", "getProgramOverview", "()Lcom/withings/programs/model/programoverview/ProgramOverview;", "progress", "getProgress", "getTargetType", "getTargetValue", "getTasksPreview", "getVisible", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;JLcom/withings/programs/model/CurrentWeekAndDay;Ljava/lang/String;Lcom/withings/programs/model/program/EligibilityDomain;Lcom/withings/programs/model/enrolled/EnrolledDetail;Ljava/lang/Long;JIILjava/lang/String;ZLcom/withings/programs/model/program/DataDomain;Lcom/withings/programs/model/programoverview/ProgramOverview;Ljava/util/List;ZLcom/withings/contentproviders/model/content/ContentAccessLevel;)Lcom/withings/programs/model/program/ProgramDomain$WifitDomain;", "equals", "other", "", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WifitDomain extends ProgramDomain {
        private final ContentAccessLevel accessLevel;
        private final int computedDuration;
        private final List<String> countryCodes;
        private final long created;
        private final Float currentStepProgression;
        private final CurrentWeekAndDay currentWeekAndDay;
        private final DataDomain data;
        private final String deployment;
        private final EligibilityDomain eligibility;
        private final EnrolledDetail enrolled;
        private final Long familyId;
        private final boolean isSuggested;
        private final long modified;
        private final int programId;
        private final ProgramOverview programOverview;
        private final int progress;
        private final int targetType;
        private final String targetValue;
        private final List<TaskPreview> tasksPreview;
        private final boolean visible;

        public /* synthetic */ WifitDomain(List list, long j5, CurrentWeekAndDay currentWeekAndDay, String str, EligibilityDomain eligibilityDomain, EnrolledDetail enrolledDetail, Long l5, long j11, int i11, int i12, String str2, boolean z5, DataDomain dataDomain, ProgramOverview programOverview, List list2, boolean z11, ContentAccessLevel contentAccessLevel, int i13, m mVar) {
            this((i13 & 1) != 0 ? null : list, j5, currentWeekAndDay, str, (i13 & 16) != 0 ? null : eligibilityDomain, enrolledDetail, l5, j11, i11, i12, str2, z5, dataDomain, programOverview, list2, z11, contentAccessLevel);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WifitDomain copy$default(WifitDomain wifitDomain, List list, long j5, CurrentWeekAndDay currentWeekAndDay, String str, EligibilityDomain eligibilityDomain, EnrolledDetail enrolledDetail, Long l5, long j11, int i11, int i12, String str2, boolean z5, DataDomain dataDomain, ProgramOverview programOverview, List list2, boolean z11, ContentAccessLevel contentAccessLevel, int i13, Object obj) {
            List<String> list3;
            long j12;
            CurrentWeekAndDay currentWeekAndDay2;
            String str3;
            EligibilityDomain eligibilityDomain2;
            EnrolledDetail enrolledDetail2;
            Long l6;
            long j13;
            int i14;
            int i15;
            String str4;
            boolean z12;
            DataDomain dataDomain2;
            ProgramOverview programOverview2;
            List<TaskPreview> list4;
            boolean z13;
            ContentAccessLevel contentAccessLevel2;
            if ((i13 & 1) != 0) {
                list3 = wifitDomain.countryCodes;
            } else {
                list3 = list;
            }
            if ((i13 & 2) != 0) {
                j12 = wifitDomain.created;
            } else {
                j12 = j5;
            }
            if ((i13 & 4) != 0) {
                currentWeekAndDay2 = wifitDomain.currentWeekAndDay;
            } else {
                currentWeekAndDay2 = currentWeekAndDay;
            }
            if ((i13 & 8) != 0) {
                str3 = wifitDomain.deployment;
            } else {
                str3 = str;
            }
            if ((i13 & 16) != 0) {
                eligibilityDomain2 = wifitDomain.eligibility;
            } else {
                eligibilityDomain2 = eligibilityDomain;
            }
            if ((i13 & 32) != 0) {
                enrolledDetail2 = wifitDomain.enrolled;
            } else {
                enrolledDetail2 = enrolledDetail;
            }
            if ((i13 & 64) != 0) {
                l6 = wifitDomain.familyId;
            } else {
                l6 = l5;
            }
            if ((i13 & 128) != 0) {
                j13 = wifitDomain.modified;
            } else {
                j13 = j11;
            }
            if ((i13 & 256) != 0) {
                i14 = wifitDomain.programId;
            } else {
                i14 = i11;
            }
            if ((i13 & 512) != 0) {
                i15 = wifitDomain.targetType;
            } else {
                i15 = i12;
            }
            if ((i13 & 1024) != 0) {
                str4 = wifitDomain.targetValue;
            } else {
                str4 = str2;
            }
            if ((i13 & ModuleCopy.f28574b) != 0) {
                z12 = wifitDomain.visible;
            } else {
                z12 = z5;
            }
            boolean z14 = z12;
            if ((i13 & 4096) != 0) {
                dataDomain2 = wifitDomain.data;
            } else {
                dataDomain2 = dataDomain;
            }
            DataDomain dataDomain3 = dataDomain2;
            if ((i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                programOverview2 = wifitDomain.programOverview;
            } else {
                programOverview2 = programOverview;
            }
            ProgramOverview programOverview3 = programOverview2;
            if ((i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                list4 = wifitDomain.tasksPreview;
            } else {
                list4 = list2;
            }
            List<TaskPreview> list5 = list4;
            if ((i13 & Utils.MAX_EVENT_SIZE) != 0) {
                z13 = wifitDomain.isSuggested;
            } else {
                z13 = z11;
            }
            if ((i13 & 65536) != 0) {
                contentAccessLevel2 = wifitDomain.accessLevel;
            } else {
                contentAccessLevel2 = contentAccessLevel;
            }
            return wifitDomain.copy(list3, j12, currentWeekAndDay2, str3, eligibilityDomain2, enrolledDetail2, l6, j13, i14, i15, str4, z14, dataDomain3, programOverview3, list5, z13, contentAccessLevel2);
        }

        public final List<String> component1() {
            return this.countryCodes;
        }

        public final int component10() {
            return this.targetType;
        }

        public final String component11() {
            return this.targetValue;
        }

        public final boolean component12() {
            return this.visible;
        }

        public final DataDomain component13() {
            return this.data;
        }

        public final ProgramOverview component14() {
            return this.programOverview;
        }

        public final List<TaskPreview> component15() {
            return this.tasksPreview;
        }

        public final boolean component16() {
            return this.isSuggested;
        }

        public final ContentAccessLevel component17() {
            return this.accessLevel;
        }

        public final long component2() {
            return this.created;
        }

        public final CurrentWeekAndDay component3() {
            return this.currentWeekAndDay;
        }

        public final String component4() {
            return this.deployment;
        }

        public final EligibilityDomain component5() {
            return this.eligibility;
        }

        public final EnrolledDetail component6() {
            return this.enrolled;
        }

        public final Long component7() {
            return this.familyId;
        }

        public final long component8() {
            return this.modified;
        }

        public final int component9() {
            return this.programId;
        }

        public final WifitDomain copy(List<String> list, long j5, CurrentWeekAndDay currentWeekAndDay, String deployment, EligibilityDomain eligibilityDomain, EnrolledDetail enrolled, Long l5, long j11, int i11, int i12, String targetValue, boolean z5, DataDomain data, ProgramOverview programOverview, List<TaskPreview> list2, boolean z11, ContentAccessLevel accessLevel) {
            u.j(currentWeekAndDay, "currentWeekAndDay");
            u.j(deployment, "deployment");
            u.j(enrolled, "enrolled");
            u.j(targetValue, "targetValue");
            u.j(data, "data");
            u.j(accessLevel, "accessLevel");
            return new WifitDomain(list, j5, currentWeekAndDay, deployment, eligibilityDomain, enrolled, l5, j11, i11, i12, targetValue, z5, data, programOverview, list2, z11, accessLevel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WifitDomain)) {
                return false;
            }
            WifitDomain wifitDomain = (WifitDomain) obj;
            if (u.e(this.countryCodes, wifitDomain.countryCodes) && this.created == wifitDomain.created && u.e(this.currentWeekAndDay, wifitDomain.currentWeekAndDay) && u.e(this.deployment, wifitDomain.deployment) && u.e(this.eligibility, wifitDomain.eligibility) && u.e(this.enrolled, wifitDomain.enrolled) && u.e(this.familyId, wifitDomain.familyId) && this.modified == wifitDomain.modified && this.programId == wifitDomain.programId && this.targetType == wifitDomain.targetType && u.e(this.targetValue, wifitDomain.targetValue) && this.visible == wifitDomain.visible && u.e(this.data, wifitDomain.data) && u.e(this.programOverview, wifitDomain.programOverview) && u.e(this.tasksPreview, wifitDomain.tasksPreview) && this.isSuggested == wifitDomain.isSuggested && this.accessLevel == wifitDomain.accessLevel) {
                return true;
            }
            return false;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public ContentAccessLevel getAccessLevel() {
            return this.accessLevel;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        protected Integer getComputedDuration() {
            return Integer.valueOf(this.computedDuration);
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public List<String> getCountryCodes() {
            return this.countryCodes;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public long getCreated() {
            return this.created;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public Float getCurrentStepProgression() {
            return this.currentStepProgression;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public CurrentWeekAndDay getCurrentWeekAndDay() {
            return this.currentWeekAndDay;
        }

        public final DataDomain getData() {
            return this.data;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public String getDeployment() {
            return this.deployment;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public EligibilityDomain getEligibility() {
            return this.eligibility;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public EnrolledDetail getEnrolled() {
            return this.enrolled;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public Long getFamilyId() {
            return this.familyId;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public long getModified() {
            return this.modified;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public int getProgramId() {
            return this.programId;
        }

        public final ProgramOverview getProgramOverview() {
            return this.programOverview;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public Integer getProgress() {
            return Integer.valueOf(this.progress);
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public int getTargetType() {
            return this.targetType;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public String getTargetValue() {
            return this.targetValue;
        }

        public final List<TaskPreview> getTasksPreview() {
            return this.tasksPreview;
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            List<String> list = this.countryCodes;
            int i11 = 0;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            int c11 = d.c(this.deployment, (this.currentWeekAndDay.hashCode() + c.a(this.created, hashCode * 31, 31)) * 31, 31);
            EligibilityDomain eligibilityDomain = this.eligibility;
            if (eligibilityDomain == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = eligibilityDomain.hashCode();
            }
            int hashCode5 = (this.enrolled.hashCode() + ((c11 + hashCode2) * 31)) * 31;
            Long l5 = this.familyId;
            if (l5 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = l5.hashCode();
            }
            int hashCode6 = (this.data.hashCode() + y1.a(this.visible, d.c(this.targetValue, h.a(this.targetType, h.a(this.programId, c.a(this.modified, (hashCode5 + hashCode3) * 31, 31), 31), 31), 31), 31)) * 31;
            ProgramOverview programOverview = this.programOverview;
            if (programOverview == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = programOverview.hashCode();
            }
            int i12 = (hashCode6 + hashCode4) * 31;
            List<TaskPreview> list2 = this.tasksPreview;
            if (list2 != null) {
                i11 = list2.hashCode();
            }
            return this.accessLevel.hashCode() + y1.a(this.isSuggested, (i12 + i11) * 31, 31);
        }

        @Override // com.withings.programs.model.program.ProgramDomain
        public boolean isSuggested() {
            return this.isSuggested;
        }

        public String toString() {
            List<String> list = this.countryCodes;
            long j5 = this.created;
            CurrentWeekAndDay currentWeekAndDay = this.currentWeekAndDay;
            String str = this.deployment;
            EligibilityDomain eligibilityDomain = this.eligibility;
            EnrolledDetail enrolledDetail = this.enrolled;
            Long l5 = this.familyId;
            long j11 = this.modified;
            int i11 = this.programId;
            int i12 = this.targetType;
            String str2 = this.targetValue;
            boolean z5 = this.visible;
            DataDomain dataDomain = this.data;
            ProgramOverview programOverview = this.programOverview;
            List<TaskPreview> list2 = this.tasksPreview;
            boolean z11 = this.isSuggested;
            ContentAccessLevel contentAccessLevel = this.accessLevel;
            return "WifitDomain(countryCodes=" + list + ", created=" + j5 + ", currentWeekAndDay=" + currentWeekAndDay + ", deployment=" + str + ", eligibility=" + eligibilityDomain + ", enrolled=" + enrolledDetail + ", familyId=" + l5 + ", modified=" + j11 + ", programId=" + i11 + ", targetType=" + i12 + ", targetValue=" + str2 + ", visible=" + z5 + ", data=" + dataDomain + ", programOverview=" + programOverview + ", tasksPreview=" + list2 + ", isSuggested=" + z11 + ", accessLevel=" + contentAccessLevel + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WifitDomain(List<String> list, long j5, CurrentWeekAndDay currentWeekAndDay, String deployment, EligibilityDomain eligibilityDomain, EnrolledDetail enrolled, Long l5, long j11, int i11, int i12, String targetValue, boolean z5, DataDomain data, ProgramOverview programOverview, List<TaskPreview> list2, boolean z11, ContentAccessLevel accessLevel) {
            super(j5, currentWeekAndDay, deployment, enrolled, l5, j11, i11, i12, targetValue, z5, list, eligibilityDomain, z11, accessLevel, null);
            Float retrieveStepProgression;
            u.j(currentWeekAndDay, "currentWeekAndDay");
            u.j(deployment, "deployment");
            u.j(enrolled, "enrolled");
            u.j(targetValue, "targetValue");
            u.j(data, "data");
            u.j(accessLevel, "accessLevel");
            this.countryCodes = list;
            this.created = j5;
            this.currentWeekAndDay = currentWeekAndDay;
            this.deployment = deployment;
            this.eligibility = eligibilityDomain;
            this.enrolled = enrolled;
            this.familyId = l5;
            this.modified = j11;
            this.programId = i11;
            this.targetType = i12;
            this.targetValue = targetValue;
            this.visible = z5;
            this.data = data;
            this.programOverview = programOverview;
            this.tasksPreview = list2;
            this.isSuggested = z11;
            this.accessLevel = accessLevel;
            this.computedDuration = retrieveComputedDuration(Integer.valueOf(data.getDuration().getRange()));
            this.progress = Math.min(getComputedDuration().intValue(), data.getDuration().getValue());
            if (getComputedDuration().intValue() > getProgress().intValue()) {
                retrieveStepProgression = Float.valueOf(1.0f);
            } else {
                retrieveStepProgression = retrieveStepProgression(Integer.valueOf(data.getDuration().getRange()));
            }
            this.currentStepProgression = retrieveStepProgression;
        }
    }

    public /* synthetic */ ProgramDomain(long j5, CurrentWeekAndDay currentWeekAndDay, String str, EnrolledDetail enrolledDetail, Long l5, long j11, int i11, int i12, String str2, boolean z5, List list, EligibilityDomain eligibilityDomain, boolean z11, ContentAccessLevel contentAccessLevel, m mVar) {
        this(j5, currentWeekAndDay, str, enrolledDetail, l5, j11, i11, i12, str2, z5, list, eligibilityDomain, z11, contentAccessLevel);
    }

    public ContentAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    protected abstract Integer getComputedDuration();

    public List<String> getCountryCodes() {
        return this.countryCodes;
    }

    public long getCreated() {
        return this.created;
    }

    public abstract Float getCurrentStepProgression();

    public CurrentWeekAndDay getCurrentWeekAndDay() {
        return this.currentWeekAndDay;
    }

    public String getDeployment() {
        return this.deployment;
    }

    public EligibilityDomain getEligibility() {
        return this.eligibility;
    }

    public EnrolledDetail getEnrolled() {
        return this.enrolled;
    }

    public Long getFamilyId() {
        return this.familyId;
    }

    public long getModified() {
        return this.modified;
    }

    public int getProgramId() {
        return this.programId;
    }

    public abstract Integer getProgress();

    public int getTargetType() {
        return this.targetType;
    }

    public String getTargetValue() {
        return this.targetValue;
    }

    public boolean getVisible() {
        return this.visible;
    }

    public boolean isSuggested() {
        return this.isSuggested;
    }

    protected final int retrieveComputedDuration(Integer num) {
        if (num != null && num.intValue() == 1) {
            return getCurrentWeekAndDay().getDayIndex();
        }
        if (num != null && num.intValue() == 2) {
            return getCurrentWeekAndDay().getWeekIndex() + 1;
        }
        if (num != null && num.intValue() == 3) {
            return getCurrentWeekAndDay().getWeekIndex() / 4;
        }
        return -1;
    }

    protected final Float retrieveStepProgression(Integer num) {
        if (num != null && num.intValue() == 2) {
            return Float.valueOf(((getCurrentWeekAndDay().getDayIndex() % 7) + 1) / 7.0f);
        }
        if (num != null && num.intValue() == 3) {
            return Float.valueOf(((getCurrentWeekAndDay().getWeekIndex() % 4) + 1) / 4.0f);
        }
        return null;
    }

    public final Companion.TaskDate retrieveTaskDate(int i11, int i12) {
        boolean z5;
        boolean z11;
        boolean z12 = false;
        if (i11 > getCurrentWeekAndDay().getWeekIndex()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i11 == getCurrentWeekAndDay().getWeekIndex()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && i12 > getCurrentWeekAndDay().getDayIndex()) {
            z12 = true;
        }
        if (z11 && i12 == getCurrentWeekAndDay().getDayIndex()) {
            return Companion.TaskDate.TODAY;
        }
        if (!z5 && !z12) {
            return Companion.TaskDate.PAST;
        }
        return Companion.TaskDate.FUTURE;
    }

    private ProgramDomain(long j5, CurrentWeekAndDay currentWeekAndDay, String str, EnrolledDetail enrolledDetail, Long l5, long j11, int i11, int i12, String str2, boolean z5, List<String> list, EligibilityDomain eligibilityDomain, boolean z11, ContentAccessLevel contentAccessLevel) {
        this.created = j5;
        this.currentWeekAndDay = currentWeekAndDay;
        this.deployment = str;
        this.enrolled = enrolledDetail;
        this.familyId = l5;
        this.modified = j11;
        this.programId = i11;
        this.targetType = i12;
        this.targetValue = str2;
        this.visible = z5;
        this.countryCodes = list;
        this.eligibility = eligibilityDomain;
        this.isSuggested = z11;
        this.accessLevel = contentAccessLevel;
    }

    public /* synthetic */ ProgramDomain(long j5, CurrentWeekAndDay currentWeekAndDay, String str, EnrolledDetail enrolledDetail, Long l5, long j11, int i11, int i12, String str2, boolean z5, List list, EligibilityDomain eligibilityDomain, boolean z11, ContentAccessLevel contentAccessLevel, int i13, m mVar) {
        this(j5, currentWeekAndDay, str, enrolledDetail, l5, j11, i11, i12, str2, z5, (i13 & 1024) != 0 ? null : list, (i13 & ModuleCopy.f28574b) != 0 ? null : eligibilityDomain, (i13 & 4096) != 0 ? false : z11, contentAccessLevel, null);
    }
}
