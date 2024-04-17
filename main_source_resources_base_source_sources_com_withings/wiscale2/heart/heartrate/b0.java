package com.withings.wiscale2.heart.heartrate;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.wiscale2.heart.heartrate.w;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w.o f57554a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(w.o oVar) {
        super(0);
        this.f57554a = oVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        w.o oVar = this.f57554a;
        oVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = oVar.f57757b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, FoodDayFragment.ARG_DAY);
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, FoodDayFragment.ARG_DAY);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra day of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
