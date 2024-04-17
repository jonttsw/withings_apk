package com.withings.programs.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.core.view.l1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
import yk.o;
import ym0.p;
/* compiled from: TutorialProxyActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/programs/ui/activity/TutorialProxyActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TutorialProxyActivity extends Hilt_TutorialProxyActivity {

    /* renamed from: e  reason: collision with root package name */
    private n f43755e;

    /* renamed from: f  reason: collision with root package name */
    private final c f43756f = new c(this);

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f43754h = {v.c(TutorialProxyActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f43753g = new Object();

    /* compiled from: TutorialProxyActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: TutorialProxyActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, 535325818, new j(TutorialProxyActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f43758a = nm0.h.b(new k(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f43759b;

        public c(Activity activity) {
            this.f43759b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f43758a.getValue();
        }
    }

    public static final User A3(TutorialProxyActivity tutorialProxyActivity) {
        return (User) tutorialProxyActivity.f43756f.getValue(tutorialProxyActivity, f43754h[0]);
    }

    @Override // com.withings.programs.ui.activity.Hilt_TutorialProxyActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 545103456, new b()));
    }
}
