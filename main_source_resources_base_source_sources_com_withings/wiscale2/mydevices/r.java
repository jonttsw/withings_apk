package com.withings.wiscale2.mydevices;

import com.withings.device.Device;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyDevicesViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.mydevices.MyDevicesViewModel$devicesFlow$1", f = "MyDevicesViewModel.kt", l = {75, 79}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class r extends kotlin.coroutines.jvm.internal.i implements ym0.p<ProducerScope<? super List<? extends Device>>, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    rh0.a f58674a;

    /* renamed from: b  reason: collision with root package name */
    int f58675b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f58676c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MyDevicesViewModel f58677d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyDevicesViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.mydevices.MyDevicesViewModel$devicesFlow$1$1", f = "MyDevicesViewModel.kt", l = {76}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58678a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProducerScope<List<? extends Device>> f58679b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MyDevicesViewModel f58680c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ProducerScope<? super List<? extends Device>> producerScope, MyDevicesViewModel myDevicesViewModel, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f58679b = producerScope;
            this.f58680c = myDevicesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f58679b, this.f58680c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58678a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                List<Device> m11 = this.f58680c.f58594b.m();
                u.i(m11, "getDevices(...)");
                this.f58678a = 1;
                if (this.f58679b.send(m11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyDevicesViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MyDevicesViewModel f58681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ rh0.a f58682b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(MyDevicesViewModel myDevicesViewModel, rh0.a aVar) {
            super(0);
            this.f58681a = myDevicesViewModel;
            this.f58682b = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f58681a.f58594b.s(this.f58682b);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyDevicesViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class c extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProducerScope<List<? extends Device>> f58683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MyDevicesViewModel f58684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ProducerScope<? super List<? extends Device>> producerScope, MyDevicesViewModel myDevicesViewModel) {
            super(0);
            this.f58683a = producerScope;
            this.f58684b = myDevicesViewModel;
        }

        @Override // ym0.a
        public final y invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f58683a, Dispatchers.getIO(), null, new s(this.f58683a, this.f58684b, null), 2, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(MyDevicesViewModel myDevicesViewModel, qm0.d<? super r> dVar) {
        super(2, dVar);
        this.f58677d = myDevicesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        r rVar = new r(this.f58677d, dVar);
        rVar.f58676c = obj;
        return rVar;
    }

    @Override // ym0.p
    public final Object invoke(ProducerScope<? super List<? extends Device>> producerScope, qm0.d<? super y> dVar) {
        return ((r) create(producerScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        rh0.a aVar;
        ProducerScope producerScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58675b;
        MyDevicesViewModel myDevicesViewModel = this.f58677d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.f58674a;
            producerScope = (ProducerScope) this.f58676c;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            ProducerScope producerScope2 = (ProducerScope) this.f58676c;
            aVar = new rh0.a(new c(producerScope2, myDevicesViewModel));
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar2 = new a(producerScope2, myDevicesViewModel, null);
            this.f58676c = producerScope2;
            this.f58674a = aVar;
            this.f58675b = 1;
            if (BuildersKt.withContext(io2, aVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            producerScope = producerScope2;
        }
        myDevicesViewModel.f58594b.q(aVar);
        b bVar = new b(myDevicesViewModel, aVar);
        this.f58676c = null;
        this.f58674a = null;
        this.f58675b = 2;
        if (ProduceKt.awaitClose(producerScope, bVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
