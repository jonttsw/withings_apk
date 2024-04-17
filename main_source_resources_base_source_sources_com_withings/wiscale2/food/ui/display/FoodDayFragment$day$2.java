package com.withings.wiscale2.food.ui.display;

import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FoodDayFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FoodDayFragment$day$2 extends w implements ym0.a<DateTime> {
    final /* synthetic */ FoodDayFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodDayFragment$day$2(FoodDayFragment foodDayFragment) {
        super(0);
        this.this$0 = foodDayFragment;
    }

    @Override // ym0.a
    public final DateTime invoke() {
        Object obj;
        Bundle a11 = yq.b.a(this.this$0);
        if (Build.VERSION.SDK_INT < 33) {
            Object serializable = a11.getSerializable(FoodDayFragment.ARG_DAY);
            if (!(serializable instanceof DateTime)) {
                serializable = null;
            }
            obj = (DateTime) serializable;
        } else {
            obj = a11.getSerializable(FoodDayFragment.ARG_DAY, DateTime.class);
        }
        DateTime dateTime = (DateTime) obj;
        return dateTime == null ? new DateTime() : dateTime;
    }
}
