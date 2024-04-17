package com.withings.healthplus.congrats.ui.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.healthplus.congrats.ui.model.SuccessTaskInfo;
import com.withings.healthplus.congrats.ui.viewmodel.CompletionActivityViewModel;
import e.k;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: CompletionActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/healthplus/congrats/ui/activity/CompletionActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CompletionActivity extends Hilt_CompletionActivity {

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f40073e = nm0.h.b(new g());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f40074f = nm0.h.b(new c());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f40075g = nm0.h.b(new h());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f40076h = nm0.h.b(new a());

    /* renamed from: i  reason: collision with root package name */
    private final i1 f40077i = new i1(q0.b(CompletionActivityViewModel.class), new e(this), new d(this), new f(this));

    /* compiled from: CompletionActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<Integer> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(CompletionActivity.this.getIntent().getIntExtra("measure_type", -1));
        }
    }

    /* compiled from: CompletionActivity.kt */
    /* loaded from: classes3.dex */
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
                o.b(false, s1.b.b(aVar2, -1467719188, new com.withings.healthplus.congrats.ui.activity.c(CompletionActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: CompletionActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<String> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            long longExtra = CompletionActivity.this.getIntent().getLongExtra("program_id", -1L);
            Long valueOf = Long.valueOf(longExtra);
            if (longExtra <= -1) {
                valueOf = null;
            }
            if (valueOf == null) {
                return null;
            }
            return valueOf.toString();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40081a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f40081a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f40081a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40082a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f40082a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f40082a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class f extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f40083a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f40083a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f40083a.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: CompletionActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends w implements ym0.a<SuccessTaskInfo> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final SuccessTaskInfo invoke() {
            Object obj;
            Intent intent = CompletionActivity.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("success_task_info", SuccessTaskInfo.class);
            } else {
                Serializable serializableExtra = intent.getSerializableExtra("success_task_info");
                if (!(serializableExtra instanceof SuccessTaskInfo)) {
                    serializableExtra = null;
                }
                obj = (SuccessTaskInfo) serializableExtra;
            }
            u.g(obj);
            return (SuccessTaskInfo) obj;
        }
    }

    /* compiled from: CompletionActivity.kt */
    /* loaded from: classes3.dex */
    static final class h extends w implements ym0.a<String> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            return CompletionActivity.this.getIntent().getStringExtra("identifier");
        }
    }

    public static final SuccessTaskInfo A3(CompletionActivity completionActivity) {
        return (SuccessTaskInfo) completionActivity.f40073e.getValue();
    }

    public static final String B3(CompletionActivity completionActivity) {
        return (String) completionActivity.f40075g.getValue();
    }

    public static final String z3(CompletionActivity completionActivity) {
        return (String) completionActivity.f40074f.getValue();
    }

    @Override // com.withings.healthplus.congrats.ui.activity.Hilt_CompletionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k.a(this, new s1.a(true, -486510650, new b()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        boolean z5;
        super.onResume();
        nm0.g gVar = this.f40073e;
        String a11 = ((SuccessTaskInfo) gVar.getValue()).a();
        nm0.g gVar2 = this.f40074f;
        String str = (String) gVar2.getValue();
        if (((SuccessTaskInfo) gVar.getValue()) != SuccessTaskInfo.f40096i) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z11 = z5;
        nm0.g gVar3 = this.f40075g;
        String str2 = (String) gVar3.getValue();
        if (((String) gVar2.getValue()) != null) {
            str2 = null;
        }
        String str3 = (String) gVar3.getValue();
        int intValue = ((Number) this.f40076h.getValue()).intValue();
        Integer valueOf = Integer.valueOf(intValue);
        if (intValue < 0) {
            valueOf = null;
        }
        st.a.c(a11, str, str2, str3, valueOf, z11, false, null, 448);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        ((CompletionActivityViewModel) this.f40077i.getValue()).i0();
        super.onStop();
    }
}
