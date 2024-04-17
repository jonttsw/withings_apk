package com.withings.wiscale2.device.common.tutorial.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.fragment.app.m0;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k0;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import com.withings.devicesetup.ui.LottieData;
import com.withings.devicesetup.ui.SetupScreen;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.u;
import dq.c0;
import fn0.k;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.h;
import nm0.y;
import tb0.g;
import xw.n;
import ym0.l;
/* compiled from: NavigationTutorialActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/common/tutorial/navigation/NavigationTutorialActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NavigationTutorialActivity extends Hilt_NavigationTutorialActivity {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f53628j = {v.c(NavigationTutorialActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final f f53629e = new f(this);

    /* renamed from: f  reason: collision with root package name */
    public List<com.withings.wiscale2.device.common.tutorial.navigation.f> f53630f;

    /* renamed from: g  reason: collision with root package name */
    private g f53631g;

    /* renamed from: h  reason: collision with root package name */
    private a f53632h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public b f53633i;

    /* compiled from: NavigationTutorialActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends g1 {

        /* renamed from: a  reason: collision with root package name */
        private final int f53634a;

        /* renamed from: b  reason: collision with root package name */
        private final Device f53635b;

        /* renamed from: c  reason: collision with root package name */
        private final PlatformFeatureRepository f53636c;

        /* renamed from: d  reason: collision with root package name */
        private final u f53637d;

        /* renamed from: e  reason: collision with root package name */
        private k0<Integer> f53638e;

        /* renamed from: f  reason: collision with root package name */
        private n<y> f53639f;

        public a(int i11, Device device, PlatformFeatureRepository featureRepository, u platformFeatureActivationFactory) {
            kotlin.jvm.internal.u.j(device, "device");
            kotlin.jvm.internal.u.j(featureRepository, "featureRepository");
            kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
            this.f53634a = i11;
            this.f53635b = device;
            this.f53636c = featureRepository;
            this.f53637d = platformFeatureActivationFactory;
            this.f53638e = xw.d.b(0);
            this.f53639f = new n<>();
        }

        public final n<y> j0() {
            return this.f53639f;
        }

        public final k0<Integer> k0() {
            return this.f53638e;
        }

        public final void m0() {
            k0<Integer> k0Var = this.f53638e;
            Integer value = k0Var.getValue();
            int i11 = this.f53634a - 1;
            if (value != null && value.intValue() == i11) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new com.withings.wiscale2.device.common.tutorial.navigation.b(this, null), 2, null);
                this.f53639f.postValue(null);
                return;
            }
            Integer value2 = k0Var.getValue();
            kotlin.jvm.internal.u.g(value2);
            k0Var.postValue(Integer.valueOf(value2.intValue() + 1));
        }

        public final void p0() {
            k0<Integer> k0Var = this.f53638e;
            Integer value = k0Var.getValue();
            if (value != null && value.intValue() == 0) {
                this.f53639f.postValue(null);
                return;
            }
            Integer value2 = k0Var.getValue();
            kotlin.jvm.internal.u.g(value2);
            k0Var.postValue(Integer.valueOf(value2.intValue() - 1));
        }
    }

    /* compiled from: NavigationTutorialActivity.kt */
    /* loaded from: classes5.dex */
    public interface b {
        a a(int i11, Device device);
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class c implements k1.b {
        public c() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends g1> U create(Class<U> modelClass) {
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            NavigationTutorialActivity navigationTutorialActivity = NavigationTutorialActivity.this;
            b bVar = navigationTutorialActivity.f53633i;
            if (bVar != null) {
                return bVar.a(navigationTutorialActivity.B3().size(), NavigationTutorialActivity.z3(navigationTutorialActivity));
            }
            kotlin.jvm.internal.u.s("viewModelFactory");
            throw null;
        }
    }

    /* compiled from: NavigationTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements l<Integer, y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Integer num) {
            LottieData lottieData;
            LottieData lottieData2;
            Integer num2 = num;
            kotlin.jvm.internal.u.g(num2);
            int intValue = num2.intValue();
            k<Object>[] kVarArr = NavigationTutorialActivity.f53628j;
            NavigationTutorialActivity navigationTutorialActivity = NavigationTutorialActivity.this;
            navigationTutorialActivity.getClass();
            c0.a aVar = c0.f64134y;
            String string = navigationTutorialActivity.getString(navigationTutorialActivity.B3().get(intValue).e());
            String string2 = navigationTutorialActivity.getString(navigationTutorialActivity.B3().get(intValue).f());
            String string3 = navigationTutorialActivity.getString(navigationTutorialActivity.B3().get(intValue).d());
            Integer a11 = navigationTutorialActivity.B3().get(intValue).a();
            String c11 = navigationTutorialActivity.B3().get(intValue).c();
            if (c11 != null) {
                String b10 = navigationTutorialActivity.B3().get(intValue).b();
                if (b10 != null) {
                    lottieData2 = new LottieData(c11, b10, false, true);
                } else {
                    lottieData2 = null;
                }
                lottieData = lottieData2;
            } else {
                lottieData = null;
            }
            kotlin.jvm.internal.u.g(string);
            SetupScreen setupScreen = new SetupScreen(string, string2, a11, lottieData, string3, null, null, 32616);
            aVar.getClass();
            c0 a12 = c0.a.a(setupScreen);
            a12.G1(new com.withings.wiscale2.device.common.tutorial.navigation.c(navigationTutorialActivity));
            m0 m11 = navigationTutorialActivity.getSupportFragmentManager().m();
            m11.l(C1987R.id.content, a12, null);
            m11.e(null);
            m11.f();
            return y.f85009a;
        }
    }

    /* compiled from: NavigationTutorialActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<y> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final y invoke() {
            NavigationTutorialActivity navigationTutorialActivity = NavigationTutorialActivity.this;
            navigationTutorialActivity.setResult(-1);
            navigationTutorialActivity.finish();
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53643a = h.b(new com.withings.wiscale2.device.common.tutorial.navigation.d(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53644b;

        public f(Activity activity) {
            this.f53644b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f53643a.getValue();
        }
    }

    public static final Device z3(NavigationTutorialActivity navigationTutorialActivity) {
        navigationTutorialActivity.getClass();
        return (Device) navigationTutorialActivity.f53629e.getValue(navigationTutorialActivity, f53628j[0]);
    }

    public final List<com.withings.wiscale2.device.common.tutorial.navigation.f> B3() {
        List<com.withings.wiscale2.device.common.tutorial.navigation.f> list = this.f53630f;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.u.s("screens");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().a0() > 1) {
            a aVar = this.f53632h;
            if (aVar != null) {
                aVar.p0();
                super.onBackPressed();
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        finish();
    }

    @Override // com.withings.wiscale2.device.common.tutorial.navigation.Hilt_NavigationTutorialActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        List<com.withings.wiscale2.device.common.tutorial.navigation.f> W;
        super.onCreate(bundle);
        int b10 = ((Device) this.f53629e.getValue(this, f53628j[0])).getModel().b();
        if (b10 != 94) {
            if (b10 != 95) {
                W = x.W(new com.withings.wiscale2.device.common.tutorial.navigation.f(C1987R.string.hwa09Setup_crownPressTutorialTitle, C1987R.string.hwa09Setup_crownPressTutorialMessage, "lottie/hwa09_tutorials/images", "lottie/hwa09_tutorials/press_crown_wakeup.json", null, 32), new com.withings.wiscale2.device.common.tutorial.navigation.f(C1987R.string.hwa09Setup_crownRotateTutorialTitle, C1987R.string.hwa09Setup_crownRotateTutorialMessage, "lottie/hwa09_tutorials/images", "lottie/hwa09_tutorials/rotate_crown_browse.json", null, 32));
            } else {
                W = x.W(new com.withings.wiscale2.device.common.tutorial.navigation.f(C1987R.string.hwa11Setup_crownPressTutorialTitle, C1987R.string.hwa11Setup_crownPressTutorialMessage, null, null, 2131232365, 24), new com.withings.wiscale2.device.common.tutorial.navigation.f(C1987R.string.hwa11Setup_crownRotateTutorialTitle, C1987R.string.hwa09Setup_crownRotateTutorialMessage, "lottie/hwa10-11_tutorials/images", "lottie/hwa10-11_tutorials/LOTTIE-SCANWATCHROSEGOLD-ROTATE CROWN.json", null, 32));
            }
        } else {
            W = x.W(new com.withings.wiscale2.device.common.tutorial.navigation.f(C1987R.string.hwa10Setup_crownPressTutorialTitle, C1987R.string.hwa10Setup_crownPressTutorialMessage, null, null, 2131232363, 24), new com.withings.wiscale2.device.common.tutorial.navigation.f(C1987R.string.hwa10Setup_crownRotateTutorialTitle, C1987R.string.hwa10Setup_crownRotateTutorialMessage, "lottie/hwa10-11_tutorials/images", "lottie/hwa10-11_tutorials/LOTTIE-SCANWATCHBLACK-ROTATE CROWN.json", null, 32));
        }
        this.f53630f = W;
        g b11 = g.b(getLayoutInflater());
        this.f53631g = b11;
        setContentView(b11.a());
        g gVar = this.f53631g;
        if (gVar != null) {
            setSupportActionBar(gVar.f99100b);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                g gVar2 = this.f53631g;
                if (gVar2 != null) {
                    Toolbar toolbar = gVar2.f99100b;
                    kotlin.jvm.internal.u.i(toolbar, "toolbar");
                    toolbar.setVisibility(0);
                    supportActionBar.q(false);
                    supportActionBar.o(true);
                } else {
                    kotlin.jvm.internal.u.s("binding");
                    throw null;
                }
            }
            a aVar = (a) new k1(this, new c()).a(a.class);
            xw.d.c(this, aVar.k0(), new d());
            xw.d.d(this, aVar.j0(), new e());
            this.f53632h = aVar;
            return;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (16908332 == item.getItemId()) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
