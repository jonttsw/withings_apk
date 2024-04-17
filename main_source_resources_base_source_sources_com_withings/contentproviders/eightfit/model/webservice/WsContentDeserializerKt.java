package com.withings.contentproviders.eightfit.model.webservice;

import com.withings.contentproviders.model.content.TaskType;
import kotlin.Metadata;
/* compiled from: WsContentDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u0001*\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0004"}, d2 = {"associatedWsClass", "Ljava/lang/Class;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsContent;", "Lcom/withings/contentproviders/model/content/TaskType;", "eightfit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WsContentDeserializerKt {

    /* compiled from: WsContentDeserializer.kt */
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

    public static final /* synthetic */ Class access$associatedWsClass(TaskType taskType) {
        return associatedWsClass(taskType);
    }

    public static final Class<? extends WsContent> associatedWsClass(TaskType taskType) {
        int i11;
        if (taskType == null) {
            i11 = -1;
        } else {
            i11 = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
        }
        switch (i11) {
            case 1:
                return WsArticleContent.class;
            case 2:
                return WsDiscoveryContent.class;
            case 3:
                return WsMeasurementContent.class;
            case 4:
                return WsObjectiveContent.class;
            case 5:
                return WsRecipeContent.class;
            case 6:
                return WsSurveyContent.class;
            case 7:
                return WsWorkoutContent.class;
            default:
                return null;
        }
    }
}
