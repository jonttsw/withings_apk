package com.withings.common.compose.component;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import d2.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
/* compiled from: ShiningComponent.kt */
/* loaded from: classes3.dex */
public final class g4 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShiningComponent.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<f2.f, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f33806a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f33807b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j5, float f11) {
            super(1);
            this.f33806a = j5;
            this.f33807b = f11;
        }

        @Override // ym0.l
        public final nm0.y invoke(f2.f fVar) {
            long j5;
            f2.f Canvas = fVar;
            kotlin.jvm.internal.u.j(Canvas, "$this$Canvas");
            long j11 = this.f33806a;
            d2.f0 j12 = d2.f0.j(d2.f0.l(j11, 0.9f));
            d2.f0 j13 = d2.f0.j(d2.f0.l(j11, 0.3f));
            j5 = d2.f0.f63265i;
            Canvas.E(x.a.b(kotlin.collections.x.W(j12, j13, d2.f0.j(j5)), this.f33807b), c2.g.g(Canvas.b()) / 2.0f, Canvas.i1(), 1.0f, f2.i.f65994a, null, 3);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShiningComponent.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f33808a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f33809b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f33810c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33811d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33812e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j5, float f11, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, int i11, int i12) {
            super(2);
            this.f33808a = j5;
            this.f33809b = f11;
            this.f33810c = pVar;
            this.f33811d = i11;
            this.f33812e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33811d | 1);
            float f11 = this.f33809b;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f33810c;
            g4.a(this.f33808a, f11, pVar, aVar, g11, this.f33812e);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShiningComponent.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.common.compose.component.ShiningComponentKt$ShiningComponent$accelerometer$1", f = "ShiningComponent.kt", l = {55}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<ProducerScope<? super nm0.j<? extends Float, ? extends Float>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33813a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f33814b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SensorManager f33815c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShiningComponent.kt */
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SensorManager f33816a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f33817b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SensorManager sensorManager, b bVar) {
                super(0);
                this.f33816a = sensorManager;
                this.f33817b = bVar;
            }

            @Override // ym0.a
            public final nm0.y invoke() {
                this.f33816a.unregisterListener(this.f33817b);
                return nm0.y.f85009a;
            }
        }

        /* compiled from: ShiningComponent.kt */
        /* loaded from: classes3.dex */
        public static final class b implements SensorEventListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ProducerScope<nm0.j<Float, Float>> f33818a;

            /* JADX WARN: Multi-variable type inference failed */
            b(ProducerScope<? super nm0.j<Float, Float>> producerScope) {
                this.f33818a = producerScope;
            }

            @Override // android.hardware.SensorEventListener
            public final void onAccuracyChanged(Sensor sensor, int i11) {
                kotlin.jvm.internal.u.j(sensor, "sensor");
            }

            @Override // android.hardware.SensorEventListener
            public final void onSensorChanged(SensorEvent event) {
                kotlin.jvm.internal.u.j(event, "event");
                this.f33818a.getChannel().mo66trySendJP2dKIU(new nm0.j<>(Float.valueOf(event.values[0]), Float.valueOf(event.values[1])));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SensorManager sensorManager, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f33815c = sensorManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(this.f33815c, dVar);
            cVar.f33814b = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(ProducerScope<? super nm0.j<? extends Float, ? extends Float>> producerScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(producerScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f33813a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                ProducerScope producerScope = (ProducerScope) this.f33814b;
                b bVar = new b(producerScope);
                SensorManager sensorManager = this.f33815c;
                sensorManager.registerListener(bVar, sensorManager.getDefaultSensor(1), 3);
                a aVar = new a(sensorManager, bVar);
                this.f33813a = 1;
                if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(long r17, float r19, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r20, androidx.compose.runtime.a r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.g4.a(long, float, ym0.p, androidx.compose.runtime.a, int, int):void");
    }
}
