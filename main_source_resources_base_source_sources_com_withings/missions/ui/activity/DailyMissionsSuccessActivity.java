package com.withings.missions.ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.core.view.l1;
import com.withings.android.activity.WithingsActivity;
import e.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: DailyMissionsSuccessActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/missions/ui/activity/DailyMissionsSuccessActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DailyMissionsSuccessActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final g f42315a = h.b(new b());

    /* compiled from: DailyMissionsSuccessActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, 744485810, new com.withings.missions.ui.activity.b(DailyMissionsSuccessActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: DailyMissionsSuccessActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<Vibrator> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Vibrator invoke() {
            Vibrator vibrator;
            int i11 = Build.VERSION.SDK_INT;
            DailyMissionsSuccessActivity dailyMissionsSuccessActivity = DailyMissionsSuccessActivity.this;
            if (i11 >= 31) {
                Object systemService = dailyMissionsSuccessActivity.getSystemService("vibrator_manager");
                u.h(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
                vibrator = e00.a.a(systemService).getDefaultVibrator();
            } else {
                Object systemService2 = dailyMissionsSuccessActivity.getSystemService("vibrator");
                u.h(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                vibrator = (Vibrator) systemService2;
            }
            u.g(vibrator);
            return vibrator;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        ((Vibrator) this.f42315a.getValue()).vibrate(VibrationEffect.createWaveform(new long[]{0, 100, 50, 100}, new int[]{0, 50, 0, 100}, -1));
        k.a(this, new s1.a(true, -1095967976, new a()));
    }
}
