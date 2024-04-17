package com.withings.wiscale2.mydevices;

import android.content.Context;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.common.device.conversation.SetGlanceSettingConversation;
import com.withings.device.Device;
import com.withings.wiscale2.mydevices.c;
import ej.w;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import nm0.y;
/* compiled from: MyDevicesViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/mydevices/MyDevicesViewModel;", "Landroidx/lifecycle/g1;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MyDevicesViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f58593a;

    /* renamed from: b  reason: collision with root package name */
    private final kn.e f58594b;

    /* renamed from: c  reason: collision with root package name */
    private final r70.c f58595c;

    /* renamed from: d  reason: collision with root package name */
    private final qh0.k f58596d;

    /* renamed from: e  reason: collision with root package name */
    private final fl.p f58597e;

    /* renamed from: f  reason: collision with root package name */
    private final w f58598f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableSharedFlow<y> f58599g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<c> f58600h;

    /* renamed from: i  reason: collision with root package name */
    private final Flow<vi.o> f58601i;

    /* compiled from: MyDevicesViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.mydevices.MyDevicesViewModel$componentDeviceUiList$1", f = "MyDevicesViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends Device>, y, qm0.d<? super List<? extends Device>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f58602a;

        /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.wiscale2.mydevices.MyDevicesViewModel$a, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.q
        public final Object invoke(List<? extends Device> list, y yVar, qm0.d<? super List<? extends Device>> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
            iVar.f58602a = list;
            return iVar.invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return this.f58602a;
        }
    }

    /* compiled from: MyDevicesViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.mydevices.MyDevicesViewModel$onGlanceToggleSettingChanged$2", f = "MyDevicesViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Device f58604b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f58605c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Device device, boolean z5, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f58604b = device;
            this.f58605c = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f58604b, this.f58605c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            kn.e eVar = MyDevicesViewModel.this.f58594b;
            Device device = this.f58604b;
            device.setGlanceEnabled(this.f58605c);
            eVar.t(device);
            return y.f85009a;
        }
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Inject
    public MyDevicesViewModel(Context context, kn.e deviceManager, r70.c userRepository, qh0.k settingsStateUseCase, fl.p pVar, w wVar, ch0.a bleDiscoverer) {
        u.j(deviceManager, "deviceManager");
        u.j(userRepository, "userRepository");
        u.j(settingsStateUseCase, "settingsStateUseCase");
        u.j(bleDiscoverer, "bleDiscoverer");
        this.f58593a = context;
        this.f58594b = deviceManager;
        this.f58595c = userRepository;
        this.f58596d = settingsStateUseCase;
        this.f58597e = pVar;
        this.f58598f = wVar;
        MutableSharedFlow<y> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f58599g = MutableSharedFlow$default;
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), null, null, new t(this, null), 3, null);
        this.f58600h = FlowKt.stateIn(FlowKt.flowOn(new lh0.l(FlowKt.transformLatest(new lh0.f(FlowKt.combine(FlowKt.callbackFlow(new r(this, null)), MutableSharedFlow$default, new kotlin.coroutines.jvm.internal.i(3, null)), this), new lh0.i(this, null))), Dispatchers.getIO()), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, null), c.b.f58646a);
        this.f58601i = bleDiscoverer.d();
    }

    public final StateFlow<c> q0() {
        return this.f58600h;
    }

    public final Flow<vi.o> r0() {
        return this.f58601i;
    }

    public final void t0(Device device, boolean z5) {
        u.j(device, "device");
        u70.i macAddress = device.getMacAddress();
        w wVar = this.f58598f;
        cj.b D = wVar.D(macAddress);
        if (D != null) {
            SetGlanceSettingConversation setGlanceSettingConversation = (SetGlanceSettingConversation) wVar.O(D, new SetGlanceSettingConversation(z5), SetGlanceSettingConversation.class);
        }
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(device, z5, null), 2, null);
    }
}
