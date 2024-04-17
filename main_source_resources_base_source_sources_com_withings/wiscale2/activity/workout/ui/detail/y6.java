package com.withings.wiscale2.activity.workout.ui.detail;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.activity.workout.ui.detail.u6;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes4.dex */
public final class y6 extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u6.c f49831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(u6.c cVar) {
        super(0);
        this.f49831a = cVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        u6.c cVar = this.f49831a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = cVar.f49705b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, FoodDayFragment.ARG_DAY);
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, FoodDayFragment.ARG_DAY);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra day of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
