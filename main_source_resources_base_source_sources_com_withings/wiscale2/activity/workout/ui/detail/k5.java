package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.views.measure.detail.ui.views.DataView;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
public final class k5 extends RecyclerView.z {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f49366g = 0;

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f49367a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f49368b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f49369c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f49370d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f49371e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f49372f;

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<ImageView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) k5.this.itemView.findViewById(C1987R.id.glyph);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<View> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return k5.this.itemView.findViewById(C1987R.id.activity_recognition_confirmation_container);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) k5.this.itemView.findViewById(C1987R.id.content_body);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<View> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return k5.this.itemView.findViewById(C1987R.id.workout_separator);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) k5.this.itemView.findViewById(C1987R.id.timestamp);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<DataView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final DataView invoke() {
            return (DataView) k5.this.itemView.findViewById(C1987R.id.value);
        }
    }

    public k5(View view) {
        super(view);
        this.f49367a = nm0.h.b(new a());
        this.f49368b = nm0.h.b(new e());
        this.f49369c = nm0.h.b(new f());
        this.f49370d = nm0.h.b(new c());
        this.f49371e = nm0.h.b(new b());
        this.f49372f = nm0.h.b(new d());
    }

    public static void a(k5 this$0, CoroutineScope coroutineScope, l7 this_with) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(coroutineScope, "$coroutineScope");
        kotlin.jvm.internal.u.j(this_with, "$this_with");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new l5(this$0, this_with.j(), null), 3, null);
    }

    public static final View b(k5 k5Var) {
        return (View) k5Var.f49371e.getValue();
    }

    public final void c(final CoroutineScope coroutineScope, final l7 l7Var, boolean z5, final int i11, final ym0.l<? super Integer, nm0.y> lVar) {
        int i12;
        boolean z11;
        int i13;
        kotlin.jvm.internal.u.j(coroutineScope, "coroutineScope");
        Context context = this.itemView.getContext();
        View view = (View) this.f49372f.getValue();
        kotlin.jvm.internal.u.i(view, "<get-separator>(...)");
        int i14 = 0;
        if (z5) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        view.setVisibility(i12);
        nm0.g gVar = this.f49369c;
        ((DataView) gVar.getValue()).setLabel(l7Var.a().getName(context));
        ((DataView) gVar.getValue()).setValue(l7Var.e());
        DateTime c11 = l7Var.c();
        Context context2 = this.itemView.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        ((TextView) this.f49368b.getValue()).setText(b50.b.m(c11, context2, true, 4));
        ((ImageView) this.f49367a.getValue()).setImageResource(l7Var.a().getGlyphRes());
        nm0.g gVar2 = this.f49370d;
        TextView textView = (TextView) gVar2.getValue();
        kotlin.jvm.internal.u.i(textView, "<get-secondaryValueView>(...)");
        if (l7Var.d() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        textView.setVisibility(i13);
        ((TextView) gVar2.getValue()).setText(l7Var.d());
        this.itemView.setOnClickListener(new com.withings.coach.chatbot.a1(2, context, l7Var));
        View view2 = (View) this.f49371e.getValue();
        kotlin.jvm.internal.u.i(view2, "<get-activityRecognition…nfirmationContainer>(...)");
        if (!l7Var.a().shouldAskActivityRecoConfirmation() || (l7Var.j().getAttrib() != 0 && l7Var.j().getAttrib() != 3)) {
            i14 = 8;
        }
        view2.setVisibility(i14);
        this.itemView.findViewById(C1987R.id.activity_recognition_confirmation_yes).setOnClickListener(new un.m(this, coroutineScope, l7Var, 1));
        this.itemView.findViewById(C1987R.id.activity_recognition_confirmation_no).setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.activity.workout.ui.detail.i5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                k5 this$0 = k5.this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                final CoroutineScope coroutineScope2 = coroutineScope;
                kotlin.jvm.internal.u.j(coroutineScope2, "$coroutineScope");
                final l7 previewInfo = l7Var;
                kotlin.jvm.internal.u.j(previewInfo, "$previewInfo");
                final ym0.l deleteCallBack = lVar;
                kotlin.jvm.internal.u.j(deleteCallBack, "$deleteCallBack");
                kotlin.jvm.internal.u.g(view3);
                Context context3 = view3.getContext();
                final com.google.android.material.bottomsheet.k kVar = new com.google.android.material.bottomsheet.k(context3);
                View inflate = LayoutInflater.from(context3).inflate(C1987R.layout.view_activity_recognition_invalidated, (ViewGroup) null);
                inflate.findViewById(C1987R.id.editSession).setOnClickListener(new com.withings.views.view.e(previewInfo, context3, kVar, 1));
                View findViewById = inflate.findViewById(C1987R.id.deleteSession);
                final int i15 = i11;
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.activity.workout.ui.detail.j5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        CoroutineScope coroutineScope3 = CoroutineScope.this;
                        kotlin.jvm.internal.u.j(coroutineScope3, "$coroutineScope");
                        com.google.android.material.bottomsheet.k bottomSheetDialog = kVar;
                        kotlin.jvm.internal.u.j(bottomSheetDialog, "$bottomSheetDialog");
                        ym0.l deleteCallBack2 = deleteCallBack;
                        kotlin.jvm.internal.u.j(deleteCallBack2, "$deleteCallBack");
                        l7 previewInfo2 = previewInfo;
                        kotlin.jvm.internal.u.j(previewInfo2, "$previewInfo");
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new m5(bottomSheetDialog, deleteCallBack2, i15, previewInfo2, null), 3, null);
                    }
                });
                kVar.setContentView(inflate);
                kVar.show();
            }
        });
    }
}
