package com.withings.appnavigation.api.sample.activity;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.v;
import androidx.compose.material.p8;
import androidx.compose.ui.e;
import bn0.d;
import d2.f0;
import d2.h1;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: SampleNavigationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/appnavigation/api/sample/activity/SampleNavigationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SampleNavigationActivity extends AppCompatActivity {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f31281b = {v.c(SampleNavigationActivity.class, "title", "getTitle()Ljava/lang/String;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final b f31282a = new b(this);

    /* compiled from: SampleNavigationActivity.kt */
    /* loaded from: classes3.dex */
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
                o.b(false, s1.b.b(aVar2, 1140102444, new com.withings.appnavigation.api.sample.activity.b(SampleNavigationActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final g f31284a = h.b(new c(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f31285b;

        public b(Activity activity) {
            this.f31285b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f31284a.getValue();
        }
    }

    public static final String A3(SampleNavigationActivity sampleNavigationActivity) {
        return (String) sampleNavigationActivity.f31282a.getValue(sampleNavigationActivity, f31281b[0]);
    }

    public static final void z3(SampleNavigationActivity sampleNavigationActivity, String str, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        long j5;
        e b10;
        long j11;
        androidx.compose.runtime.b bVar;
        int i13;
        sampleNavigationActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(2130801455);
        if ((i11 & 14) == 0) {
            if (g11.K(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            e.a aVar2 = e.f8927a;
            j5 = f0.f63258b;
            b10 = androidx.compose.foundation.c.b(aVar2, j5, h1.a());
            j11 = f0.f63261e;
            bVar = g11;
            p8.b(str, b10, j11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, (i12 & 14) | 432, 0, 131064);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new com.withings.appnavigation.api.sample.activity.a(sampleNavigationActivity, str, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 514743686, new a()));
    }
}
