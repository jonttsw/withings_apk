package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import com.withings.location.model.GpsLocation;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import nm0.k;
/* compiled from: WorkoutHeader.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutHeaderStateLiveData$city$1$1", f = "WorkoutHeader.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class h4 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<String>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49217a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f49218b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<GpsLocation> f49219c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j4 f49220d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(List<GpsLocation> list, j4 j4Var, qm0.d<? super h4> dVar) {
        super(2, dVar);
        this.f49219c = list;
        this.f49220d = j4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        h4 h4Var = new h4(this.f49219c, this.f49220d, dVar);
        h4Var.f49218b = obj;
        return h4Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<String> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((h4) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [nm0.k$a] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Context context;
        Address address;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49217a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f49218b;
            GpsLocation gpsLocation = (GpsLocation) kotlin.collections.x.K(this.f49219c);
            String str2 = null;
            if (gpsLocation != null) {
                try {
                    context = this.f49220d.f49330a;
                    List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(gpsLocation.getPosition().getLatitude(), gpsLocation.getPosition().getLongitude(), 1);
                    if (fromLocation != null && (address = (Address) kotlin.collections.x.K(fromLocation)) != null) {
                        str = address.getLocality();
                    } else {
                        str = null;
                    }
                } catch (Throwable th2) {
                    str = nm0.l.a(th2);
                }
                if (!(str instanceof k.a)) {
                    str2 = str;
                }
                str2 = str2;
            }
            this.f49217a = 1;
            if (h0Var.emit(str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
