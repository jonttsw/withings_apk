package com.withings.tutorials.ui.screens.tab;

import android.app.Activity;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.core.view.l1;
import com.withings.tutorials.core.model.TabType;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: TabPresentationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/tutorials/ui/screens/tab/TabPresentationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TabPresentationActivity extends Hilt_TabPresentationActivity {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f46244h = {v.c(TabPresentationActivity.class, "alreadyDisplayTabTypeAsString", "getAlreadyDisplayTabTypeAsString()Ljava/lang/String;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public r8.n f46246f;

    /* renamed from: e  reason: collision with root package name */
    private final c f46245e = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final ym0.a<y> f46247g = new a();

    /* compiled from: TabPresentationActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<y> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final y invoke() {
            TabPresentationActivity tabPresentationActivity = TabPresentationActivity.this;
            r8.n nVar = tabPresentationActivity.f46246f;
            if (nVar != null) {
                if (!nVar.N()) {
                    tabPresentationActivity.finish();
                }
                return y.f85009a;
            }
            u.s("navController");
            throw null;
        }
    }

    /* compiled from: TabPresentationActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 2110305021, new l(TabPresentationActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f46250a = nm0.h.b(new m(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f46251b;

        public c(Activity activity) {
            this.f46251b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f46250a.getValue();
        }
    }

    public static final TabType A3(TabPresentationActivity tabPresentationActivity) {
        return TabType.valueOf((String) tabPresentationActivity.f46245e.getValue(tabPresentationActivity, f46244h[0]));
    }

    @Override // com.withings.tutorials.ui.screens.tab.Hilt_TabPresentationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 1746444003, new b()));
    }
}
