package com.withings.contentproviders.eightfit.model;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import qk.f6;
import qk.fa;
import qk.g4;
import qk.jc;
import qk.z5;
import qk.za;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentCategory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/ContentCategory;", "", "wsValue", "", RemoteMessageConst.Notification.ICON, "", "displayNameResource", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDisplayNameResource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIcon", "getWsValue", "()Ljava/lang/String;", "ARTICLE", "WORKOUT", "RECIPE", "MEASUREMENT", "OBJECTIVE", "IN_APP_SURVEY", "DISCOVERY", "UNKNOWN", "Companion", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ContentCategory[] $VALUES;
    public static final ContentCategory ARTICLE;
    public static final Companion Companion;
    public static final ContentCategory DISCOVERY;
    public static final ContentCategory IN_APP_SURVEY;
    public static final ContentCategory MEASUREMENT;
    public static final ContentCategory OBJECTIVE;
    public static final ContentCategory RECIPE;
    public static final ContentCategory UNKNOWN;
    public static final ContentCategory WORKOUT;
    private final Integer displayNameResource;
    private final Integer icon;
    private final String wsValue;

    /* compiled from: ContentCategory.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/contentproviders/eightfit/model/ContentCategory$Companion;", "", "()V", "findByWsConstant", "Lcom/withings/contentproviders/eightfit/model/ContentCategory;", "wsConstant", "", "eightfit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final ContentCategory findByWsConstant(String wsConstant) {
            Object obj;
            u.j(wsConstant, "wsConstant");
            Iterator<E> it = ContentCategory.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (u.e(((ContentCategory) obj).getWsValue(), wsConstant)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ContentCategory contentCategory = (ContentCategory) obj;
            if (contentCategory == null) {
                return ContentCategory.UNKNOWN;
            }
            return contentCategory;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ContentCategory[] $values() {
        return new ContentCategory[]{ARTICLE, WORKOUT, RECIPE, MEASUREMENT, OBJECTIVE, IN_APP_SURVEY, DISCOVERY, UNKNOWN};
    }

    static {
        fa faVar = fa.f92926a;
        ARTICLE = new ContentCategory("ARTICLE", 0, ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE, Integer.valueOf(b0.G(faVar)), Integer.valueOf((int) C1987R.string.programsTask_articleCategory));
        WORKOUT = new ContentCategory("WORKOUT", 1, ConstantsWs.WELLNESS_TASK_TYPE_VIDEO_WORKOUT, Integer.valueOf(b0.G(z5.f93226a)), Integer.valueOf((int) C1987R.string.programsTask_workoutCategory));
        RECIPE = new ContentCategory("RECIPE", 2, ConstantsWs.WELLNESS_TASK_TYPE_RECIPE, Integer.valueOf(b0.G(f6.f92922a)), Integer.valueOf((int) C1987R.string.programsTask_recipeCategory));
        MEASUREMENT = new ContentCategory("MEASUREMENT", 3, ConstantsWs.WELLNESS_TASK_TYPE_MEASUREMENT, Integer.valueOf(b0.G(za.f93231a)), Integer.valueOf((int) C1987R.string.programsTask_measurementCategory));
        OBJECTIVE = new ContentCategory("OBJECTIVE", 4, ConstantsWs.WELLNESS_TASK_TYPE_OBJECTIVE, Integer.valueOf(b0.G(g4.f92936a)), Integer.valueOf((int) C1987R.string.programsTask_objectiveCategory));
        IN_APP_SURVEY = new ContentCategory("IN_APP_SURVEY", 5, ConstantsWs.WELLNESS_TASK_TYPE_SURVEY, Integer.valueOf(b0.G(jc.f92992a)), Integer.valueOf((int) C1987R.string.programsTask_surveyCategory));
        DISCOVERY = new ContentCategory("DISCOVERY", 6, ConstantsWs.WELLNESS_TASK_TYPE_DISCOVERY, Integer.valueOf(b0.G(faVar)), Integer.valueOf((int) C1987R.string.programsTask_discoveryCategory));
        UNKNOWN = new ContentCategory("UNKNOWN", 7, "", null, null, 6, null);
        ContentCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        Companion = new Companion(null);
    }

    private ContentCategory(String str, int i11, String str2, Integer num, Integer num2) {
        this.wsValue = str2;
        this.icon = num;
        this.displayNameResource = num2;
    }

    public static a<ContentCategory> getEntries() {
        return $ENTRIES;
    }

    public static ContentCategory valueOf(String str) {
        return (ContentCategory) Enum.valueOf(ContentCategory.class, str);
    }

    public static ContentCategory[] values() {
        return (ContentCategory[]) $VALUES.clone();
    }

    public final Integer getDisplayNameResource() {
        return this.displayNameResource;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final String getWsValue() {
        return this.wsValue;
    }

    /* synthetic */ ContentCategory(String str, int i11, String str2, Integer num, Integer num2, int i12, m mVar) {
        this(str, i11, str2, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : num2);
    }
}
