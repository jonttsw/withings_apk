package com.withings.healthplus.library.ui.model;

import com.withings.contentproviders.model.content.TaskType;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import qk.a;
import qk.f6;
import qk.fa;
import qk.z5;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExploreType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/library/ui/model/ExploreType;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ExploreType {

    /* renamed from: e  reason: collision with root package name */
    public static final ExploreType f40399e;

    /* renamed from: f  reason: collision with root package name */
    public static final ExploreType f40400f;

    /* renamed from: g  reason: collision with root package name */
    public static final ExploreType f40401g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ ExploreType[] f40402h;

    /* renamed from: a  reason: collision with root package name */
    private final TaskType f40403a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40404b;

    /* renamed from: c  reason: collision with root package name */
    private final int f40405c;

    /* renamed from: d  reason: collision with root package name */
    private final a f40406d;

    static {
        ExploreType exploreType = new ExploreType("Article", 0, TaskType.f35295a, C1987R.string.bookmark_labelArticles, C1987R.string.content_library_article_filter_link_thumbnail, fa.f92926a);
        f40399e = exploreType;
        ExploreType exploreType2 = new ExploreType("Workout", 1, TaskType.f35301g, C1987R.string.bookmark_labelWorkouts, C1987R.string.content_library_workout_filter_link_thumbnail, z5.f93226a);
        f40400f = exploreType2;
        ExploreType exploreType3 = new ExploreType("Recipe", 2, TaskType.f35299e, C1987R.string.bookmark_labelRecipes, C1987R.string.content_library_recipe_filter_link_thumbnail, f6.f92922a);
        f40401g = exploreType3;
        ExploreType[] exploreTypeArr = {exploreType, exploreType2, exploreType3};
        f40402h = exploreTypeArr;
        b.a(exploreTypeArr);
    }

    private ExploreType(String str, int i11, TaskType taskType, int i12, int i13, a aVar) {
        this.f40403a = taskType;
        this.f40404b = i12;
        this.f40405c = i13;
        this.f40406d = aVar;
    }

    public static ExploreType valueOf(String str) {
        return (ExploreType) Enum.valueOf(ExploreType.class, str);
    }

    public static ExploreType[] values() {
        return (ExploreType[]) f40402h.clone();
    }

    public final int a() {
        return this.f40404b;
    }

    public final a b() {
        return this.f40406d;
    }

    public final int d() {
        return this.f40405c;
    }

    public final TaskType e() {
        return this.f40403a;
    }
}
