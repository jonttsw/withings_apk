package com.withings.scalesmodes.ui;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: ScalesModeActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/scalesmodes/ui/ScalesModeActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ScalesModeActivity extends Hilt_ScalesModeActivity {

    /* compiled from: ScalesModeActivity.kt */
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
                o.b(false, s1.b.b(aVar2, 540560103, new e(ScalesModeActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    @Override // com.withings.scalesmodes.ui.Hilt_ScalesModeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 80520653, new a()));
    }
}
