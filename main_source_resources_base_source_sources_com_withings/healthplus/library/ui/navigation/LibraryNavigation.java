package com.withings.healthplus.library.ui.navigation;

import androidx.camera.camera2.internal.v1;
import androidx.navigation.compose.n;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import r8.m;
/* compiled from: LibraryNavigation.kt */
/* loaded from: classes3.dex */
public final class LibraryNavigation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LibraryNavigation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/healthplus/library/ui/navigation/LibraryNavigation$Destinations;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Destinations {

        /* renamed from: b  reason: collision with root package name */
        public static final a f40407b;

        /* renamed from: c  reason: collision with root package name */
        public static final Destinations f40408c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ Destinations[] f40409d;

        /* renamed from: a  reason: collision with root package name */
        private final String f40410a;

        /* compiled from: LibraryNavigation.kt */
        /* loaded from: classes3.dex */
        public static final class a {
            public static String a(a aVar, TaskType taskType, long j5, String str, String str2, int i11) {
                if ((i11 & 8) != 0) {
                    str = null;
                }
                if ((i11 & 32) != 0) {
                    str2 = null;
                }
                aVar.getClass();
                u.j(taskType, "taskType");
                StringBuilder sb2 = new StringBuilder("categoryLibrary?");
                sb2.append("taskType=" + taskType);
                sb2.append("&contentCategoryFilterId=" + ((Object) null));
                sb2.append("&user_id=" + j5);
                if (str != null) {
                    sb2.append("&originContentId=".concat(str));
                }
                if (str2 != null) {
                    sb2.append("&programInformation=".concat(str2));
                }
                String sb3 = sb2.toString();
                u.i(sb3, "toString(...)");
                return sb3;
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.withings.healthplus.library.ui.navigation.LibraryNavigation$Destinations$a] */
        static {
            Destinations destinations = new Destinations("LibraryCategorySelectionScreenRoute", 0, "rootLibrary?user_id={user_id}");
            Destinations destinations2 = new Destinations("LibraryCategoryScreenRoute", 1, "categoryLibrary?taskType={category}&contentCategoryFilterId={categoryFilter}&user_id={user_id}&cid={cid}&programInformation={programInformation}&missionInformation={missionInformation}&originContentId={originContentId}");
            f40408c = destinations2;
            Destinations[] destinationsArr = {destinations, destinations2};
            f40409d = destinationsArr;
            sm0.b.a(destinationsArr);
            f40407b = new Object();
        }

        private Destinations(String str, int i11, String str2) {
            this.f40410a = str2;
        }

        public static Destinations valueOf(String str) {
            return (Destinations) Enum.valueOf(Destinations.class, str);
        }

        public static Destinations[] values() {
            return (Destinations[]) f40409d.clone();
        }

        public final String a() {
            return this.f40410a;
        }
    }

    public static void a(long j5, m mVar, TaskType taskType, Integer num, String str, String str2, ym0.a onBackClick, ym0.u uVar) {
        u.j(mVar, "<this>");
        u.j(onBackClick, "onBackClick");
        n.b(mVar, Destinations.f40408c.a(), x.W(v1.d0("category", new a(taskType)), v1.d0("categoryFilter", new b(num)), v1.d0(HealthUserProfile.USER_PROFILE_KEY_USER_ID, new c(j5)), v1.d0("cid", new d(str)), v1.d0(NavigationArguments.ORIGINAL_CONTENT_ID_TO_BE_SWAPPED, e.f40415a), v1.d0(NavigationArguments.MISSION_INFORMATION, new f(str2)), v1.d0(NavigationArguments.PROGRAM_INFORMATION, g.f40417a)), null, null, null, null, null, new s1.a(true, -1883842592, new i(onBackClick, uVar)), 124);
    }
}
