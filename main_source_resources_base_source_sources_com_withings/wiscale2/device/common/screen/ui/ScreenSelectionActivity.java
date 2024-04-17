package com.withings.wiscale2.device.common.screen.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.devicescreens.model.CustomScreenMode;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.tutorials.core.FeatureTutorial;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.screen.ui.w1;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o60.e;
import sc0.b;
/* compiled from: ScreenSelectionActivity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0010²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\"\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/screen/ui/ScreenSelectionActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lcom/withings/wiscale2/device/common/screen/ui/y1;", "state", "", "isSaving", "", "showInformationAlertDialogWithText", "Lnm0/j;", "Lsc0/b;", "", "Lsc0/b$a;", "screenWithChildrenWarning", "screenWithParentWarning", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScreenSelectionActivity extends Hilt_ScreenSelectionActivity {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f53124l = {androidx.camera.core.v.c(ScreenSelectionActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(ScreenSelectionActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0)};
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public c2 f53128h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public h70.b f53129i;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f53131k;

    /* renamed from: e  reason: collision with root package name */
    private final o f53125e = new o(this);

    /* renamed from: f  reason: collision with root package name */
    private final p f53126f = new p(this);

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f53127g = nm0.h.b(new m());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f53130j = nm0.h.b(new q());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f53132a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ym0.l<? super Integer, nm0.y> lVar) {
            super(0);
            this.f53132a = lVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f53132a.invoke(Integer.valueOf((int) C1987R.string.scaleCustomization_stepWarningAndroid));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f53133a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ym0.l<? super Integer, nm0.y> lVar) {
            super(0);
            this.f53133a = lVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f53133a.invoke(Integer.valueOf((int) C1987R.string.scaleCustomization_enableHeartRateWarning));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y1 f53135b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f53136c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.p<sc0.b, List<b.a>, nm0.y> f53137d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.p<sc0.b, b.a, nm0.y> f53138e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f53139f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f53140g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(y1 y1Var, boolean z5, ym0.p<? super sc0.b, ? super List<b.a>, nm0.y> pVar, ym0.p<? super sc0.b, ? super b.a, nm0.y> pVar2, ym0.l<? super Integer, nm0.y> lVar, int i11) {
            super(2);
            this.f53135b = y1Var;
            this.f53136c = z5;
            this.f53137d = pVar;
            this.f53138e = pVar2;
            this.f53139f = lVar;
            this.f53140g = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f53140g | 1);
            ym0.p<sc0.b, b.a, nm0.y> pVar = this.f53138e;
            ym0.l<Integer, nm0.y> lVar = this.f53139f;
            ScreenSelectionActivity.this.z3(this.f53135b, this.f53136c, this.f53137d, pVar, lVar, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            ScreenSelectionActivity.this.finish();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<CustomScreenMode, nm0.y> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(CustomScreenMode customScreenMode) {
            CustomScreenMode it = customScreenMode;
            kotlin.jvm.internal.u.j(it, "it");
            ScreenSelectionViewModel D3 = ScreenSelectionActivity.D3(ScreenSelectionActivity.this);
            D3.getClass();
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(D3), null, null, new z1(D3, it, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            ScreenSelectionActivity.D3(ScreenSelectionActivity.this).W0();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<sc0.b, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f53144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScreenSelectionActivity f53145b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, ScreenSelectionActivity screenSelectionActivity) {
            super(1);
            this.f53144a = context;
            this.f53145b = screenSelectionActivity;
        }

        @Override // ym0.l
        public final nm0.y invoke(sc0.b bVar) {
            sc0.b screen = bVar;
            kotlin.jvm.internal.u.j(screen, "screen");
            String c11 = screen.c();
            if (c11 != null) {
                this.f53145b.f53131k.a(HMWebActivity.a.a(HMWebActivity.f35395c, this.f53144a, null, null, c11, 22));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.l<sc0.b, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<sc0.b, b.a, nm0.y> f53146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScreenSelectionActivity f53147b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ym0.p<? super sc0.b, ? super b.a, nm0.y> pVar, ScreenSelectionActivity screenSelectionActivity) {
            super(1);
            this.f53146a = pVar;
            this.f53147b = screenSelectionActivity;
        }

        @Override // ym0.l
        public final nm0.y invoke(sc0.b bVar) {
            sc0.b it = bVar;
            kotlin.jvm.internal.u.j(it, "it");
            b.InterfaceC1611b d11 = it.d();
            if (d11 instanceof b.InterfaceC1611b.e) {
                this.f53146a.invoke(it, ((b.InterfaceC1611b.e) d11).a());
            } else {
                ScreenSelectionActivity.D3(this.f53147b).X0(it);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.l<sc0.b, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<sc0.b, List<b.a>, nm0.y> f53148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScreenSelectionActivity f53149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(ym0.p<? super sc0.b, ? super List<b.a>, nm0.y> pVar, ScreenSelectionActivity screenSelectionActivity) {
            super(1);
            this.f53148a = pVar;
            this.f53149b = screenSelectionActivity;
        }

        @Override // ym0.l
        public final nm0.y invoke(sc0.b bVar) {
            sc0.b it = bVar;
            kotlin.jvm.internal.u.j(it, "it");
            b.InterfaceC1611b d11 = it.d();
            if (d11 instanceof b.InterfaceC1611b.h) {
                this.f53148a.invoke(it, ((b.InterfaceC1611b.h) d11).a());
            } else {
                ScreenSelectionActivity.D3(this.f53149b).X0(it);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<Integer, Integer, nm0.y> {
        j() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(Integer num, Integer num2) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            ScreenSelectionViewModel D3 = ScreenSelectionActivity.D3(ScreenSelectionActivity.this);
            D3.getClass();
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(D3), null, null, new a2(D3, intValue, intValue2, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        k() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            ScreenSelectionActivity.F3(ScreenSelectionActivity.this, num.intValue());
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f53152a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(ym0.l<? super Integer, nm0.y> lVar) {
            super(0);
            this.f53152a = lVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f53152a.invoke(Integer.valueOf((int) C1987R.string.scaleCustomization_bluetoothCellNotAvailableWarning));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    static final class m extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        m() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(ScreenSelectionActivity.this.getIntent().getBooleanExtra("from_install", false));
        }
    }

    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        n() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 3182791, new com.withings.wiscale2.device.common.screen.ui.o(ScreenSelectionActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class o implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53155a = nm0.h.b(new com.withings.wiscale2.device.common.screen.ui.p(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53156b;

        public o(Activity activity) {
            this.f53156b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f53155a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class p implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f53157a = nm0.h.b(new com.withings.wiscale2.device.common.screen.ui.q(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f53158b;

        public p(Activity activity) {
            this.f53158b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f53157a.getValue();
        }
    }

    /* compiled from: ScreenSelectionActivity.kt */
    /* loaded from: classes5.dex */
    static final class q extends kotlin.jvm.internal.w implements ym0.a<ScreenSelectionViewModel> {
        q() {
            super(0);
        }

        @Override // ym0.a
        public final ScreenSelectionViewModel invoke() {
            ScreenSelectionActivity screenSelectionActivity = ScreenSelectionActivity.this;
            return (ScreenSelectionViewModel) new androidx.lifecycle.k1(screenSelectionActivity, new r(screenSelectionActivity)).a(ScreenSelectionViewModel.class);
        }
    }

    public ScreenSelectionActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new Object());
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f53131k = registerForActivityResult;
    }

    public static final Device A3(ScreenSelectionActivity screenSelectionActivity) {
        screenSelectionActivity.getClass();
        return (Device) screenSelectionActivity.f53125e.getValue(screenSelectionActivity, f53124l[0]);
    }

    public static final long C3(ScreenSelectionActivity screenSelectionActivity) {
        screenSelectionActivity.getClass();
        return ((Number) screenSelectionActivity.f53126f.getValue(screenSelectionActivity, f53124l[1])).longValue();
    }

    public static final ScreenSelectionViewModel D3(ScreenSelectionActivity screenSelectionActivity) {
        return (ScreenSelectionViewModel) screenSelectionActivity.f53130j.getValue();
    }

    public static final boolean E3(ScreenSelectionActivity screenSelectionActivity) {
        return ((Boolean) screenSelectionActivity.f53127g.getValue()).booleanValue();
    }

    public static final void F3(ScreenSelectionActivity screenSelectionActivity, int i11) {
        Object obj;
        screenSelectionActivity.getClass();
        Iterator it = ((kotlin.collections.c) e.a.f86479a).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o60.e.a((FeatureTutorial) obj) == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        FeatureTutorial featureTutorial = (FeatureTutorial) obj;
        if (featureTutorial != null) {
            h70.b bVar = screenSelectionActivity.f53129i;
            if (bVar != null) {
                fn0.k<Object>[] kVarArr = f53124l;
                screenSelectionActivity.startActivity(bVar.a(screenSelectionActivity, (Device) screenSelectionActivity.f53125e.getValue(screenSelectionActivity, kVarArr[0]), featureTutorial, ((Number) screenSelectionActivity.f53126f.getValue(screenSelectionActivity, kVarArr[1])).longValue(), false));
                return;
            }
            kotlin.jvm.internal.u.s("getFeatureTutorialIntentUseCase");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.device.common.screen.ui.Hilt_ScreenSelectionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(!((Boolean) this.f53127g.getValue()).booleanValue());
        }
        ((ScreenSelectionViewModel) this.f53130j.getValue()).O0().observe(this, new w1.a(new com.withings.wiscale2.device.common.screen.ui.d(this)));
        int modelId = ((Device) this.f53125e.getValue(this, f53124l[0])).getModelId();
        int i11 = v70.a.f103433b;
        v70.a.c("device_settings_screen_personalization", kotlin.collections.s0.i(new nm0.j("device_model", Integer.valueOf(modelId))), 2);
        e.k.a(this, new s1.a(true, 853620397, new n()));
    }

    public final void z3(y1 state, boolean z5, ym0.p<? super sc0.b, ? super List<b.a>, nm0.y> showScreenWithChildrenAlertDialog, ym0.p<? super sc0.b, ? super b.a, nm0.y> showScreenWithParentAlertDialog, ym0.l<? super Integer, nm0.y> showInformationAlertDialogWithTextRes, androidx.compose.runtime.a aVar, int i11) {
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.u.j(state, "state");
        kotlin.jvm.internal.u.j(showScreenWithChildrenAlertDialog, "showScreenWithChildrenAlertDialog");
        kotlin.jvm.internal.u.j(showScreenWithParentAlertDialog, "showScreenWithParentAlertDialog");
        kotlin.jvm.internal.u.j(showInformationAlertDialogWithTextRes, "showInformationAlertDialogWithTextRes");
        androidx.compose.runtime.b g11 = aVar.g(1209890947);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        d dVar = new d();
        e eVar = new e();
        f fVar = new f();
        g gVar = new g((Context) g11.D(androidx.compose.ui.platform.u0.d()), this);
        h hVar = new h(showScreenWithParentAlertDialog, this);
        i iVar = new i(showScreenWithChildrenAlertDialog, this);
        j jVar = new j();
        k kVar = new k();
        g11.s(-1426118332);
        int i12 = (57344 & i11) ^ 24576;
        boolean z13 = false;
        if ((i12 > 16384 && g11.K(showInformationAlertDialogWithTextRes)) || (i11 & 24576) == 16384) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object t11 = g11.t();
        if (z11 || t11 == a.C0060a.a()) {
            t11 = new l(showInformationAlertDialogWithTextRes);
            g11.n(t11);
        }
        ym0.a aVar3 = (ym0.a) t11;
        g11.J();
        g11.s(-1426118188);
        if ((i12 > 16384 && g11.K(showInformationAlertDialogWithTextRes)) || (i11 & 24576) == 16384) {
            z12 = true;
        } else {
            z12 = false;
        }
        Object t12 = g11.t();
        if (z12 || t12 == a.C0060a.a()) {
            t12 = new a(showInformationAlertDialogWithTextRes);
            g11.n(t12);
        }
        ym0.a aVar4 = (ym0.a) t12;
        g11.J();
        g11.s(-1426118059);
        if ((i12 > 16384 && g11.K(showInformationAlertDialogWithTextRes)) || (i11 & 24576) == 16384) {
            z13 = true;
        }
        Object t13 = g11.t();
        if (z13 || t13 == a.C0060a.a()) {
            t13 = new b(showInformationAlertDialogWithTextRes);
            g11.n(t13);
        }
        g11.J();
        w1.d(aVar2, state, dVar, eVar, fVar, z5, gVar, hVar, iVar, jVar, kVar, aVar3, aVar4, (ym0.a) t13, g11, ((i11 << 3) & 112) | 6 | ((i11 << 12) & 458752), 0, 0);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(state, z5, showScreenWithChildrenAlertDialog, showScreenWithParentAlertDialog, showInformationAlertDialogWithTextRes, i11));
        }
    }
}
