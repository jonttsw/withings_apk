package com.withings.tutorials.ui;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.core.FeatureTutorial;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
/* compiled from: TutorialActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/tutorials/ui/TutorialActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TutorialActivity extends Hilt_TutorialActivity {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f44678l = {androidx.camera.core.v.c(TutorialActivity.class, "tutorialIdentifier", "getTutorialIdentifier()I", 0), androidx.camera.core.v.c(TutorialActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(TutorialActivity.class, "userID", "getUserID()J", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final i1 f44679e = new i1(q0.b(TutorialViewModel.class), new h(this), new g(this), new i(this));

    /* renamed from: f  reason: collision with root package name */
    private final d f44680f = new d(this);

    /* renamed from: g  reason: collision with root package name */
    private final e f44681g = new e(this);

    /* renamed from: h  reason: collision with root package name */
    private final f f44682h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f44683i = nm0.h.b(new b());
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public ch.d f44684j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public fl.p f44685k;

    /* compiled from: TutorialActivity.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<FeatureTutorial> f44686a = sm0.b.a(FeatureTutorial.values());
    }

    /* compiled from: TutorialActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(TutorialActivity.this.getIntent().getBooleanExtra("feature_activated", false));
        }
    }

    /* compiled from: TutorialActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeatureTutorial f44689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FeatureTutorial featureTutorial) {
            super(2);
            this.f44689b = featureTutorial;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1846483599, new c0(TutorialActivity.this, this.f44689b)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f44690a = nm0.h.b(new d0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f44691b;

        public d(Activity activity) {
            this.f44691b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f44690a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class e implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f44692a = nm0.h.b(new e0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f44693b;

        public e(Activity activity) {
            this.f44693b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f44692a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class f implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f44694a = nm0.h.b(new f0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f44695b;

        public f(Activity activity) {
            this.f44695b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f44694a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f44696a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f44696a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f44697a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f44697a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44698a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f44698a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f44698a.getDefaultViewModelCreationExtras();
        }
    }

    public static final boolean A3(TutorialActivity tutorialActivity) {
        return ((Boolean) tutorialActivity.f44683i.getValue()).booleanValue();
    }

    public static final long B3(TutorialActivity tutorialActivity) {
        return ((Number) tutorialActivity.f44682h.getValue(tutorialActivity, f44678l[2])).longValue();
    }

    public static final TutorialViewModel C3(TutorialActivity tutorialActivity) {
        return (TutorialViewModel) tutorialActivity.f44679e.getValue();
    }

    public static final void D3(TutorialActivity tutorialActivity, Uri uri) {
        fl.c cVar;
        if (uri == null) {
            fl.p pVar = tutorialActivity.f44685k;
            if (pVar != null) {
                fl.o g11 = pVar.g((Device) tutorialActivity.f44681g.getValue(tutorialActivity, f44678l[1]));
                if (g11 instanceof fl.c) {
                    cVar = (fl.c) g11;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    String string = tutorialActivity.getString(cVar.h());
                    kotlin.jvm.internal.u.i(string, "getString(...)");
                    uri = Uri.parse(string);
                } else {
                    uri = null;
                }
                if (uri == null) {
                    return;
                }
            } else {
                kotlin.jvm.internal.u.s("deviceModelFactory");
                throw null;
            }
        }
        ch.d dVar = tutorialActivity.f44684j;
        if (dVar != null) {
            tutorialActivity.startActivity(((ah.z) dVar.m()).b(tutorialActivity, uri, true, new HMWebViewDelegate()));
            return;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }

    public static final Device z3(TutorialActivity tutorialActivity) {
        tutorialActivity.getClass();
        return (Device) tutorialActivity.f44681g.getValue(tutorialActivity, f44678l[1]);
    }

    @Override // com.withings.tutorials.ui.Hilt_TutorialActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        d dVar;
        fn0.k<Object>[] kVarArr;
        Object obj;
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        Iterator it = ((kotlin.collections.c) a.f44686a).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dVar = this.f44680f;
            kVarArr = f44678l;
            if (hasNext) {
                obj = it.next();
                if (o60.e.a((FeatureTutorial) obj) == ((Number) dVar.getValue(this, kVarArr[0])).intValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        FeatureTutorial featureTutorial = (FeatureTutorial) obj;
        if (featureTutorial != null) {
            e.k.a(this, new s1.a(true, 671409367, new c(featureTutorial)));
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(android.support.v4.media.a.a("TutorialActivity received a tutorial identifier that is not handled : ", ((Number) dVar.getValue(this, kVarArr[0])).intValue()));
        x70.b.n(illegalArgumentException);
        throw illegalArgumentException;
    }
}
