package com.withings.contentproviders.eightfit.model.webservice;

import com.withings.contentproviders.model.content.TaskType;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
/* compiled from: TaskTypeExtension.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"wsValue", "", "Lcom/withings/contentproviders/model/content/TaskType;", "eightfit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaskTypeExtensionKt {

    /* compiled from: TaskTypeExtension.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                TaskType taskType = TaskType.f35295a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TaskType taskType2 = TaskType.f35295a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TaskType taskType3 = TaskType.f35295a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TaskType taskType4 = TaskType.f35295a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TaskType taskType5 = TaskType.f35295a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TaskType taskType6 = TaskType.f35295a;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TaskType taskType7 = TaskType.f35295a;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String wsValue(TaskType taskType) {
        u.j(taskType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()]) {
            case 1:
                return ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE;
            case 2:
                return ConstantsWs.WELLNESS_TASK_TYPE_DISCOVERY;
            case 3:
                return ConstantsWs.WELLNESS_TASK_TYPE_MEASUREMENT;
            case 4:
                return ConstantsWs.WELLNESS_TASK_TYPE_OBJECTIVE;
            case 5:
                return ConstantsWs.WELLNESS_TASK_TYPE_RECIPE;
            case 6:
                return ConstantsWs.WELLNESS_TASK_TYPE_SURVEY;
            case 7:
                return "workout";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
