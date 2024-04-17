package com.withings.healthplus.navigation.ui.navigation;

import android.os.Bundle;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.h2;
import androidx.camera.core.v;
import androidx.camera.core.y1;
import androidx.lifecycle.u0;
import com.google.gson.Gson;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: NavigationArguments.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments;", "", "()V", "CONTENT_CATEGORY", "", "CONTENT_CATEGORY_FILTER_ID", "CONTENT_ID", "FROM_LIBRARY", "INSTANCE_ID", "IS_COMPLETED", "MISSION_ID", "MISSION_INFORMATION", "NUTRITION_INFO", "ORIGINAL_CONTENT_ID_TO_BE_SWAPPED", "PROGRAM_ID", "PROGRAM_INFORMATION", "REMOTE_TASK_ID", "SHOULD_DISPLAY_DAYS_BEFORE_START_TOAST", "TASK_ID", "TASK_TYPE", CommonConstant.RETKEY.USERID, "VIDEO_URL", "JoiningProgramLoadingDestination", "MissionInformation", "NutritionInformationSheetDestination", "ProgramDetailDestination", "ProgramInformation", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavigationArguments {
    public static final String CONTENT_CATEGORY = "contentCategory";
    public static final String CONTENT_CATEGORY_FILTER_ID = "contentCategoryFilterId";
    public static final String CONTENT_ID = "contentId";
    public static final String FROM_LIBRARY = "fromLibrary";
    public static final NavigationArguments INSTANCE = new NavigationArguments();
    public static final String INSTANCE_ID = "instanceId";
    public static final String IS_COMPLETED = "isCompleted";
    public static final String MISSION_ID = "missionId";
    public static final String MISSION_INFORMATION = "missionInformation";
    public static final String NUTRITION_INFO = "nutritionInfo";
    public static final String ORIGINAL_CONTENT_ID_TO_BE_SWAPPED = "originContentId";
    public static final String PROGRAM_ID = "programId";
    public static final String PROGRAM_INFORMATION = "programInformation";
    public static final String REMOTE_TASK_ID = "remoteTaskId";
    public static final String SHOULD_DISPLAY_DAYS_BEFORE_START_TOAST = "shouldDisplayDaysBeforeStartToast";
    public static final String TASK_ID = "taskId";
    public static final String TASK_TYPE = "taskType";
    public static final String USER_ID = "userId";
    public static final String VIDEO_URL = "videoUrl";

    /* compiled from: NavigationArguments.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$JoiningProgramLoadingDestination;", "", "()V", "root", "", "route", NavigationArguments.PROGRAM_ID, "", NavigationArguments.USER_ID, "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class JoiningProgramLoadingDestination {
        public static final JoiningProgramLoadingDestination INSTANCE = new JoiningProgramLoadingDestination();
        private static final String root = "joiningProgramLoading";
        public static final String route = "joiningProgramLoading/{userId}/{programId}";

        private JoiningProgramLoadingDestination() {
        }

        public final String route(long j5, long j11) {
            StringBuilder e11 = v.e("joiningProgramLoading/", j11, "/");
            e11.append(j5);
            return e11.toString();
        }
    }

    /* compiled from: NavigationArguments.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$MissionInformation;", "", NavigationArguments.MISSION_ID, "", NavigationArguments.IS_COMPLETED, "", "relatedProgramTaskId", "", "(IZLjava/lang/String;)V", "()Z", "getMissionId", "()I", "getRelatedProgramTaskId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MissionInformation {
        public static final Companion Companion = new Companion(null);
        private final boolean isCompleted;
        private final int missionId;
        private final String relatedProgramTaskId;

        /* compiled from: NavigationArguments.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$MissionInformation$Companion;", "", "Landroid/os/Bundle;", "Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$MissionInformation;", "retrieveMissionInformation", "(Landroid/os/Bundle;)Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$MissionInformation;", "Landroidx/lifecycle/u0;", "(Landroidx/lifecycle/u0;)Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$MissionInformation;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            public final MissionInformation retrieveMissionInformation(Bundle bundle) {
                String string;
                if (bundle == null || (string = bundle.getString(NavigationArguments.MISSION_INFORMATION)) == null) {
                    return null;
                }
                return (MissionInformation) new Gson().fromJson(string, (Class<Object>) MissionInformation.class);
            }

            private Companion() {
            }

            public final MissionInformation retrieveMissionInformation(u0 u0Var) {
                u.j(u0Var, "<this>");
                String str = (String) u0Var.c(NavigationArguments.MISSION_INFORMATION);
                if (str != null) {
                    return (MissionInformation) new Gson().fromJson(str, (Class<Object>) MissionInformation.class);
                }
                return null;
            }
        }

        public MissionInformation(int i11, boolean z5, String str) {
            this.missionId = i11;
            this.isCompleted = z5;
            this.relatedProgramTaskId = str;
        }

        public static /* synthetic */ MissionInformation copy$default(MissionInformation missionInformation, int i11, boolean z5, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = missionInformation.missionId;
            }
            if ((i12 & 2) != 0) {
                z5 = missionInformation.isCompleted;
            }
            if ((i12 & 4) != 0) {
                str = missionInformation.relatedProgramTaskId;
            }
            return missionInformation.copy(i11, z5, str);
        }

        public final int component1() {
            return this.missionId;
        }

        public final boolean component2() {
            return this.isCompleted;
        }

        public final String component3() {
            return this.relatedProgramTaskId;
        }

        public final MissionInformation copy(int i11, boolean z5, String str) {
            return new MissionInformation(i11, z5, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MissionInformation)) {
                return false;
            }
            MissionInformation missionInformation = (MissionInformation) obj;
            if (this.missionId == missionInformation.missionId && this.isCompleted == missionInformation.isCompleted && u.e(this.relatedProgramTaskId, missionInformation.relatedProgramTaskId)) {
                return true;
            }
            return false;
        }

        public final int getMissionId() {
            return this.missionId;
        }

        public final String getRelatedProgramTaskId() {
            return this.relatedProgramTaskId;
        }

        public int hashCode() {
            int hashCode;
            int a11 = y1.a(this.isCompleted, Integer.hashCode(this.missionId) * 31, 31);
            String str = this.relatedProgramTaskId;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return a11 + hashCode;
        }

        public final boolean isCompleted() {
            return this.isCompleted;
        }

        public String toString() {
            int i11 = this.missionId;
            boolean z5 = this.isCompleted;
            String str = this.relatedProgramTaskId;
            StringBuilder sb2 = new StringBuilder("MissionInformation(missionId=");
            sb2.append(i11);
            sb2.append(", isCompleted=");
            sb2.append(z5);
            sb2.append(", relatedProgramTaskId=");
            return y1.e(sb2, str, ")");
        }
    }

    /* compiled from: NavigationArguments.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$NutritionInformationSheetDestination;", "", "()V", "root", "", "route", "nutritionInformation", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class NutritionInformationSheetDestination {
        public static final NutritionInformationSheetDestination INSTANCE = new NutritionInformationSheetDestination();
        private static final String root = "nutritionInformationSheet";
        public static final String route = "nutritionInformationSheet/{nutritionInfo}";

        private NutritionInformationSheetDestination() {
        }

        public final String route(String nutritionInformation) {
            u.j(nutritionInformation, "nutritionInformation");
            return "nutritionInformationSheet/".concat(nutritionInformation);
        }
    }

    /* compiled from: NavigationArguments.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$ProgramDetailDestination;", "", "()V", "root", "", "route", "navigateToContentScreenRoute", NavigationArguments.INSTANCE_ID, "", NavigationArguments.PROGRAM_ID, "", NavigationArguments.SHOULD_DISPLAY_DAYS_BEFORE_START_TOAST, "", NavigationArguments.USER_ID, "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ProgramDetailDestination {
        public static final ProgramDetailDestination INSTANCE = new ProgramDetailDestination();
        private static final String root = "programDetail";
        public static final String route = "programDetail?userId={userId}&programId={programId}&instanceId={instanceId}&shouldDisplayDaysBeforeStartToast={shouldDisplayDaysBeforeStartToast}";

        private ProgramDetailDestination() {
        }

        public final String navigateToContentScreenRoute(int i11, long j5, boolean z5, long j11) {
            StringBuilder sb2 = new StringBuilder("programDetail?");
            sb2.append("programId=" + j5);
            sb2.append("&userId=" + j11);
            sb2.append("&instanceId=" + i11);
            sb2.append("&shouldDisplayDaysBeforeStartToast=" + z5);
            String sb3 = sb2.toString();
            u.i(sb3, "toString(...)");
            return sb3;
        }
    }

    /* compiled from: NavigationArguments.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$ProgramInformation;", "", NavigationArguments.PROGRAM_ID, "", NavigationArguments.INSTANCE_ID, "", "programTaskId", "", "(JILjava/lang/String;)V", "getInstanceId", "()I", "getProgramId", "()J", "getProgramTaskId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ProgramInformation {
        public static final Companion Companion = new Companion(null);
        private final int instanceId;
        private final long programId;
        private final String programTaskId;

        /* compiled from: NavigationArguments.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$ProgramInformation$Companion;", "", "Landroid/os/Bundle;", "Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$ProgramInformation;", "retrieveProgramInformation", "(Landroid/os/Bundle;)Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$ProgramInformation;", "Landroidx/lifecycle/u0;", "(Landroidx/lifecycle/u0;)Lcom/withings/healthplus/navigation/ui/navigation/NavigationArguments$ProgramInformation;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            public final ProgramInformation retrieveProgramInformation(Bundle bundle) {
                String string;
                if (bundle == null || (string = bundle.getString(NavigationArguments.PROGRAM_INFORMATION)) == null) {
                    return null;
                }
                return (ProgramInformation) new Gson().fromJson(string, (Class<Object>) ProgramInformation.class);
            }

            private Companion() {
            }

            public final ProgramInformation retrieveProgramInformation(u0 u0Var) {
                u.j(u0Var, "<this>");
                String str = (String) u0Var.c(NavigationArguments.PROGRAM_INFORMATION);
                if (str != null) {
                    return (ProgramInformation) new Gson().fromJson(str, (Class<Object>) ProgramInformation.class);
                }
                return null;
            }
        }

        public ProgramInformation(long j5, int i11, String programTaskId) {
            u.j(programTaskId, "programTaskId");
            this.programId = j5;
            this.instanceId = i11;
            this.programTaskId = programTaskId;
        }

        public static /* synthetic */ ProgramInformation copy$default(ProgramInformation programInformation, long j5, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j5 = programInformation.programId;
            }
            if ((i12 & 2) != 0) {
                i11 = programInformation.instanceId;
            }
            if ((i12 & 4) != 0) {
                str = programInformation.programTaskId;
            }
            return programInformation.copy(j5, i11, str);
        }

        public final long component1() {
            return this.programId;
        }

        public final int component2() {
            return this.instanceId;
        }

        public final String component3() {
            return this.programTaskId;
        }

        public final ProgramInformation copy(long j5, int i11, String programTaskId) {
            u.j(programTaskId, "programTaskId");
            return new ProgramInformation(j5, i11, programTaskId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgramInformation)) {
                return false;
            }
            ProgramInformation programInformation = (ProgramInformation) obj;
            if (this.programId == programInformation.programId && this.instanceId == programInformation.instanceId && u.e(this.programTaskId, programInformation.programTaskId)) {
                return true;
            }
            return false;
        }

        public final int getInstanceId() {
            return this.instanceId;
        }

        public final long getProgramId() {
            return this.programId;
        }

        public final String getProgramTaskId() {
            return this.programTaskId;
        }

        public int hashCode() {
            return this.programTaskId.hashCode() + h.a(this.instanceId, Long.hashCode(this.programId) * 31, 31);
        }

        public String toString() {
            long j5 = this.programId;
            int i11 = this.instanceId;
            String str = this.programTaskId;
            StringBuilder sb2 = new StringBuilder("ProgramInformation(programId=");
            sb2.append(j5);
            sb2.append(", instanceId=");
            sb2.append(i11);
            return h2.c(sb2, ", programTaskId=", str, ")");
        }
    }

    private NavigationArguments() {
    }
}
