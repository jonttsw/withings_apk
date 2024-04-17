package com.withings.wiscale2.features;

import android.os.Bundle;
import androidx.core.view.l1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.android.activity.WithingsActivity;
import e.k;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: FeatureFlagsActivity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002²\u0006$\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\t0\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/features/FeatureFlagsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "", FirebaseAnalytics.Event.SEARCH, "", "Lxr/a;", "filteredFlags", "Lnm0/j;", "Lcom/withings/features/model/FeatureFlagCategory;", "Lpf0/h;", "flagsByCategory", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FeatureFlagsActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f56103a = nm0.h.b(new a());

    /* compiled from: FeatureFlagsActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<String> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            String str;
            Bundle extras = FeatureFlagsActivity.this.getIntent().getExtras();
            if (extras != null) {
                str = extras.getString("title", "");
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        }
    }

    /* compiled from: FeatureFlagsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, 1248489217, new h(FeatureFlagsActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if ((r3 instanceof java.lang.Object) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A3(com.withings.wiscale2.features.FeatureFlagsActivity r3) {
        /*
            android.content.Intent r3 = r3.getIntent()
            android.os.Bundle r3 = r3.getExtras()
            r0 = 0
            if (r3 == 0) goto L20
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L16
            java.io.Serializable r3 = androidx.appcompat.app.p.d(r3)
            goto L21
        L16:
            java.lang.String r1 = "list"
            java.io.Serializable r3 = r3.getSerializable(r1)
            boolean r1 = r3 instanceof java.lang.Object
            if (r1 != 0) goto L21
        L20:
            r3 = r0
        L21:
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L28
            r0 = r3
            java.util.List r0 = (java.util.List) r0
        L28:
            if (r0 != 0) goto L2c
            kotlin.collections.i0 r0 = kotlin.collections.i0.f76187a
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.features.FeatureFlagsActivity.A3(com.withings.wiscale2.features.FeatureFlagsActivity):java.util.List");
    }

    public static final String z3(FeatureFlagsActivity featureFlagsActivity) {
        return (String) featureFlagsActivity.f56103a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        k.a(this, new s1.a(true, 1433085275, new b()));
    }
}
