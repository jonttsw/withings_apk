package com.withings.healthplus.contentscreens.ui.navigation;

import androidx.camera.camera2.internal.v1;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
public final class ContentScreenNavigation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContentScreenNavigation.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/navigation/ContentScreenNavigation$Destinations;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Destinations {

        /* renamed from: b  reason: collision with root package name */
        public static final a f40134b;

        /* renamed from: c  reason: collision with root package name */
        public static final Destinations f40135c;

        /* renamed from: d  reason: collision with root package name */
        public static final Destinations f40136d;

        /* renamed from: e  reason: collision with root package name */
        public static final Destinations f40137e;

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ Destinations[] f40138f;

        /* renamed from: a  reason: collision with root package name */
        private final String f40139a;

        /* compiled from: ContentScreenNavigation.kt */
        /* loaded from: classes3.dex */
        public static final class a {
            public static String a(String contentId, TaskType taskType, long j5, boolean z5, String str, String str2, String str3, String str4) {
                u.j(contentId, "contentId");
                u.j(taskType, "taskType");
                StringBuilder sb2 = new StringBuilder("contentScreen?");
                sb2.append("taskType=" + taskType);
                sb2.append("&userId=" + j5);
                sb2.append("&contentId=".concat(contentId));
                if (str != null) {
                    sb2.append("&programInformation=".concat(str));
                }
                if (str2 != null) {
                    sb2.append("&missionInformation=".concat(str2));
                }
                if (str3 != null) {
                    sb2.append("&originContentId=".concat(str3));
                }
                sb2.append("&fromLibrary=" + z5);
                if (str4 != null) {
                    sb2.append("&id_tag=".concat(str4));
                }
                String sb3 = sb2.toString();
                u.i(sb3, "toString(...)");
                return sb3;
            }

            public static /* synthetic */ String b(a aVar, String str, TaskType taskType, long j5, String str2, int i11) {
                if ((i11 & 16) != 0) {
                    str2 = null;
                }
                aVar.getClass();
                return a(str, taskType, j5, false, str2, null, null, null);
            }

            public static String c(String contentId, String str, String str2, String str3) {
                u.j(contentId, "contentId");
                StringBuilder sb2 = new StringBuilder("contentScreen/workoutWatchSuggestion?");
                sb2.append("videoUrl=" + str);
                sb2.append("&contentId=".concat(contentId));
                if (str2 != null) {
                    sb2.append("&programInformation=".concat(str2));
                }
                if (str3 != null) {
                    sb2.append("&missionInformation=".concat(str3));
                }
                String sb3 = sb2.toString();
                u.i(sb3, "toString(...)");
                return sb3;
            }

            public static String d(String contentId, String str, String str2, String str3) {
                u.j(contentId, "contentId");
                StringBuilder sb2 = new StringBuilder("contentScreen/workoutPlayer?");
                sb2.append("videoUrl=" + str);
                sb2.append("&contentId=".concat(contentId));
                if (str2 != null) {
                    sb2.append("&programInformation=".concat(str2));
                }
                if (str3 != null) {
                    sb2.append("&missionInformation=".concat(str3));
                }
                String sb3 = sb2.toString();
                u.i(sb3, "toString(...)");
                return sb3;
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.withings.healthplus.contentscreens.ui.navigation.ContentScreenNavigation$Destinations$a, java.lang.Object] */
        static {
            Destinations destinations = new Destinations("ContentScreen", 0, "contentScreen?taskType={taskType}&userId={userId}&contentId={contentId}&programInformation={programInformation}&missionInformation={missionInformation}&originContentId={originContentId}&fromLibrary={fromLibrary}&id_tag={id_tag}");
            f40135c = destinations;
            Destinations destinations2 = new Destinations("WorkoutPlayerScreen", 1, "contentScreen/workoutPlayer?videoUrl={videoUrl}&contentId={contentId}&programInformation={programInformation}&missionInformation={missionInformation}");
            f40136d = destinations2;
            Destinations destinations3 = new Destinations("SuggestWorkoutLaunchOnWatchScreen", 2, "contentScreen/workoutWatchSuggestion?videoUrl={videoUrl}&contentId={contentId}&programInformation={programInformation}&missionInformation={missionInformation}");
            f40137e = destinations3;
            Destinations[] destinationsArr = {destinations, destinations2, destinations3};
            f40138f = destinationsArr;
            sm0.b.a(destinationsArr);
            f40134b = new Object();
        }

        private Destinations(String str, int i11, String str2) {
            this.f40139a = str2;
        }

        public static Destinations valueOf(String str) {
            return (Destinations) Enum.valueOf(Destinations.class, str);
        }

        public static Destinations[] values() {
            return (Destinations[]) f40138f.clone();
        }

        public final String a() {
            return this.f40139a;
        }
    }

    public static void a(r8.m mVar, ym0.l modifyStateScreen, r8.n nVar, ym0.l lVar, ym0.a onBackClick, ym0.q qVar, ym0.l lVar2, ym0.a aVar, ym0.l lVar3, long j5, String str, String str2, ym0.q qVar2, TaskType taskType) {
        u.j(mVar, "<this>");
        u.j(modifyStateScreen, "modifyStateScreen");
        u.j(onBackClick, "onBackClick");
        androidx.navigation.compose.n.b(mVar, Destinations.f40135c.a(), x.W(v1.d0(NavigationArguments.USER_ID, new g(j5)), v1.d0(NavigationArguments.TASK_TYPE, new h(taskType)), v1.d0(NavigationArguments.CONTENT_ID, new i(str)), v1.d0(NavigationArguments.MISSION_INFORMATION, new j(str2)), v1.d0(NavigationArguments.PROGRAM_INFORMATION, new k(null)), v1.d0(NavigationArguments.ORIGINAL_CONTENT_ID_TO_BE_SWAPPED, l.f40156a), v1.d0(NavigationArguments.FROM_LIBRARY, m.f40157a), v1.d0("id_tag", n.f40158a)), null, null, null, null, null, new s1.a(true, 1582174262, new t(onBackClick, lVar, lVar2, lVar3, qVar, qVar2, aVar, nVar)), 124);
        androidx.navigation.compose.n.b(mVar, Destinations.f40136d.a(), x.V(v1.d0(NavigationArguments.VIDEO_URL, a.f40140a)), null, null, null, null, null, new s1.a(true, -977513633, new c(onBackClick, modifyStateScreen)), 124);
        androidx.navigation.compose.n.b(mVar, Destinations.f40137e.a(), null, null, null, null, null, null, new s1.a(true, 1575229822, new f(nVar, onBackClick)), 126);
    }
}
