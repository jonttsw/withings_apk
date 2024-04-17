package com.withings.contentfavorite.navigation;

import androidx.camera.camera2.internal.v1;
import androidx.navigation.compose.n;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import r8.m;
import ym0.l;
import ym0.p;
/* compiled from: ContentFavoriteNavGraph.kt */
/* loaded from: classes3.dex */
public final class ContentFavoriteNavGraph {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContentFavoriteNavGraph.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/contentfavorite/navigation/ContentFavoriteNavGraph$Destinations;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Destinations {

        /* renamed from: b  reason: collision with root package name */
        public static final Destinations f35242b;

        /* renamed from: c  reason: collision with root package name */
        public static final Destinations f35243c;

        /* renamed from: d  reason: collision with root package name */
        public static final Destinations f35244d;

        /* renamed from: e  reason: collision with root package name */
        public static final Destinations f35245e;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ Destinations[] f35246f;

        /* renamed from: a  reason: collision with root package name */
        private final String f35247a;

        static {
            Destinations destinations = new Destinations("ContentFavoriteList", 0, "contentFavoriteOverView/{taskCategory}/{userId}");
            f35242b = destinations;
            Destinations destinations2 = new Destinations("ContentFavoriteRecipe", 1, "recipe/{contentId}/{userId}");
            f35243c = destinations2;
            Destinations destinations3 = new Destinations("ContentFavoriteArticle", 2, "article/{contentId}/{userId}");
            f35244d = destinations3;
            Destinations destinations4 = new Destinations("ContentFavoriteWorkout", 3, "workout/{contentId}/{userId}");
            f35245e = destinations4;
            Destinations[] destinationsArr = {destinations, destinations2, destinations3, destinations4};
            f35246f = destinationsArr;
            sm0.b.a(destinationsArr);
        }

        private Destinations(String str, int i11, String str2) {
            this.f35247a = str2;
        }

        public static Destinations valueOf(String str) {
            return (Destinations) Enum.valueOf(Destinations.class, str);
        }

        public static Destinations[] values() {
            return (Destinations[]) f35246f.clone();
        }

        public final String a() {
            return this.f35247a;
        }
    }

    public static void a(long j5, m mVar, String str, ym0.a onBackClick, l lVar, p pVar) {
        u.j(mVar, "<this>");
        u.j(onBackClick, "onBackClick");
        n.b(mVar, Destinations.f35242b.a(), x.W(v1.d0("taskCategory", new a(str)), v1.d0(NavigationArguments.USER_ID, new b(j5))), null, null, null, null, null, new s1.a(true, 1038769954, new c(new d(pVar), onBackClick, lVar)), 124);
    }
}
