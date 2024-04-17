package com.withings.healthplus.congrats.ui.model;

import com.withings.contentproviders.model.content.TaskType;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuccessTaskInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/healthplus/congrats/ui/model/SuccessTaskInfo;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SuccessTaskInfo {

    /* renamed from: g  reason: collision with root package name */
    public static final a f40094g;

    /* renamed from: h  reason: collision with root package name */
    public static final SuccessTaskInfo f40095h;

    /* renamed from: i  reason: collision with root package name */
    public static final SuccessTaskInfo f40096i;

    /* renamed from: j  reason: collision with root package name */
    public static final SuccessTaskInfo f40097j;

    /* renamed from: k  reason: collision with root package name */
    public static final SuccessTaskInfo f40098k;

    /* renamed from: l  reason: collision with root package name */
    public static final SuccessTaskInfo f40099l;

    /* renamed from: m  reason: collision with root package name */
    public static final SuccessTaskInfo f40100m;

    /* renamed from: n  reason: collision with root package name */
    public static final SuccessTaskInfo f40101n;

    /* renamed from: o  reason: collision with root package name */
    public static final SuccessTaskInfo f40102o;

    /* renamed from: p  reason: collision with root package name */
    private static final /* synthetic */ SuccessTaskInfo[] f40103p;

    /* renamed from: a  reason: collision with root package name */
    private final String f40104a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40105b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40106c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40107d;

    /* renamed from: e  reason: collision with root package name */
    private final String f40108e;

    /* renamed from: f  reason: collision with root package name */
    private final TaskType f40109f;

    /* compiled from: SuccessTaskInfo.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.withings.healthplus.congrats.ui.model.SuccessTaskInfo$a] */
    static {
        SuccessTaskInfo successTaskInfo = new SuccessTaskInfo("ARTICLE", 0, "ic_success_article", "programsArticle_Success_title%s", "programsArticle_Success_description%s", "programsArticle_Success_finish_btn%s", ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE, TaskType.f35295a);
        f40095h = successTaskInfo;
        SuccessTaskInfo successTaskInfo2 = new SuccessTaskInfo("PROGRAM", 1, "ic_success_program", "programs_Success_finish_title%s", "programs_Success_finish_description%s", "programs_Success_finish_btn%s", "program_end", null);
        f40096i = successTaskInfo2;
        TaskType taskType = TaskType.f35297c;
        SuccessTaskInfo successTaskInfo3 = new SuccessTaskInfo("MEASUREMENT", 2, "ic_success_measurement", "programsMeasurement_withDevice_Success_finish_title", "programsMeasurement_withDevice_Success_finish_description", "programsMeasurement_withDevice_finish_btn", ConstantsWs.WELLNESS_TASK_TYPE_MEASUREMENT, taskType);
        f40097j = successTaskInfo3;
        SuccessTaskInfo successTaskInfo4 = new SuccessTaskInfo("MEASUREMENT_MANUAL_LOG", 3, "ic_success_measurement", "programsMeasurement_withoutDevice_Success_finish_title", "programsMeasurement_withoutDevice_Success_finish_description", "programsMeasurement_withoutDevice_Success_finish_btn", "manual_log", taskType);
        f40098k = successTaskInfo4;
        SuccessTaskInfo successTaskInfo5 = new SuccessTaskInfo("RECIPE", 4, "ic_success_recipe", "programsRecipe_Success_title%s", "programsRecipe_Success_description%s", "programsRecipe_Success_finish_btn%s", ConstantsWs.WELLNESS_TASK_TYPE_RECIPE, TaskType.f35299e);
        f40099l = successTaskInfo5;
        SuccessTaskInfo successTaskInfo6 = new SuccessTaskInfo("WORKOUT", 5, "ic_success_workout", "programsWorkout_Success_title%s", "programsWorkout_Success_description%s", "programsWorkout_Success_finish_btn%s", "workout", TaskType.f35301g);
        f40100m = successTaskInfo6;
        SuccessTaskInfo successTaskInfo7 = new SuccessTaskInfo("SURVEY", 6, "ic_success_survey", "programsSurvey_Success_title", "programsSurvey_Success_description", "programsSurvey_Success_finish_btn", ConstantsWs.WELLNESS_TASK_TYPE_SURVEY, TaskType.f35300f);
        f40101n = successTaskInfo7;
        SuccessTaskInfo successTaskInfo8 = new SuccessTaskInfo("DISCOVERY", 7, "ic_success_discovery", "programsDiscovery_Success_title", "programsDiscovery_Success_description", "programsDiscovery_Success_finish_btn", "product_discovery", TaskType.f35296b);
        f40102o = successTaskInfo8;
        SuccessTaskInfo[] successTaskInfoArr = {successTaskInfo, successTaskInfo2, successTaskInfo3, successTaskInfo4, successTaskInfo5, successTaskInfo6, successTaskInfo7, successTaskInfo8};
        f40103p = successTaskInfoArr;
        b.a(successTaskInfoArr);
        f40094g = new Object();
    }

    private SuccessTaskInfo(String str, int i11, String str2, String str3, String str4, String str5, String str6, TaskType taskType) {
        this.f40104a = str2;
        this.f40105b = str3;
        this.f40106c = str4;
        this.f40107d = str5;
        this.f40108e = str6;
        this.f40109f = taskType;
    }

    public static SuccessTaskInfo valueOf(String str) {
        return (SuccessTaskInfo) Enum.valueOf(SuccessTaskInfo.class, str);
    }

    public static SuccessTaskInfo[] values() {
        return (SuccessTaskInfo[]) f40103p.clone();
    }

    public final String a() {
        return this.f40108e;
    }

    public final String b() {
        return this.f40107d;
    }

    public final String d() {
        return this.f40106c;
    }

    public final String e() {
        return this.f40104a;
    }

    public final TaskType f() {
        return this.f40109f;
    }

    public final String h() {
        return this.f40105b;
    }
}
