package com.withings.wiscale2.partner.ui.fitdataviewer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.withings.android.activity.WithingsActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: FitViewerDataTypesActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/partner/ui/fitdataviewer/FitViewerDataTypesActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FitViewerDataTypesActivity extends WithingsActivity {

    /* compiled from: FitViewerDataTypesActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 1629400645, new d(FitViewerDataTypesActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 1051244959, new a()));
    }
}
