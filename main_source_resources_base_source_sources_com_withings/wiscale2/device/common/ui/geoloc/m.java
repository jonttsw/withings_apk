package com.withings.wiscale2.device.common.ui.geoloc;

import android.content.Intent;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: WeatherAirQualityActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.geoloc.WeatherAirQualityActivity$onDoneClicked$1", f = "WeatherAirQualityActivity.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53875a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WeatherAirQualityActivity f53876b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeatherAirQualityActivity f53877a;

        a(WeatherAirQualityActivity weatherAirQualityActivity) {
            this.f53877a = weatherAirQualityActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            if (kotlin.jvm.internal.u.e((Boolean) obj, Boolean.FALSE)) {
                Intent intent = new Intent();
                WeatherAirQualityActivity weatherAirQualityActivity = this.f53877a;
                weatherAirQualityActivity.setResult(-1, intent.putExtra("extra_device", WeatherAirQualityActivity.D3(weatherAirQualityActivity).r0()));
                weatherAirQualityActivity.finish();
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(WeatherAirQualityActivity weatherAirQualityActivity, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f53876b = weatherAirQualityActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f53876b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((m) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53875a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            WeatherAirQualityActivity weatherAirQualityActivity = this.f53876b;
            MutableStateFlow<Boolean> y02 = WeatherAirQualityActivity.D3(weatherAirQualityActivity).y0();
            a aVar = new a(weatherAirQualityActivity);
            this.f53875a = 1;
            if (y02.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
