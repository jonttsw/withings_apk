package com.withings.wiscale2.vascularage;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.wiscale2.vascularage.y;
import java.io.Serializable;
import org.joda.time.DateTime;
/* compiled from: Fragment.kt */
/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.w implements ym0.a<DateTime> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y.h f62313a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(y.h hVar) {
        super(0);
        this.f62313a = hVar;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        y.h hVar = this.f62313a;
        hVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DateTime.class);
        Fragment fragment = hVar.f62553b;
        if (isAssignableFrom) {
            return (DateTime) yq.b.d(fragment, FoodDayFragment.ARG_DAY);
        }
        if (Serializable.class.isAssignableFrom(DateTime.class)) {
            return (DateTime) yq.b.e(fragment, FoodDayFragment.ARG_DAY);
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra day of class ", kotlin.jvm.internal.q0.b(DateTime.class), " is not supported"));
    }
}
