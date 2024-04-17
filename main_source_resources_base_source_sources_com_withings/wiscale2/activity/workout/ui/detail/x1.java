package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.LockableScrollView;
import com.withings.views.view.StatBarLayout;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.logging.ui.EditWorkoutActivity;
import com.withings.wiscale2.activity.workout.goal.ui.WorkoutGoalActivity;
import com.withings.wiscale2.activity.workout.photo.ui.WorkoutPhotosActivity;
import com.withings.wiscale2.activity.workout.ui.detail.b7;
import com.withings.wiscale2.activity.workout.ui.detail.r6;
import com.withings.wiscale2.activity.workout.ui.detail.u6;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
import javax.inject.Inject;
import jm.a;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: WorkoutDetailFragment.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/activity/workout/ui/detail/x1;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/BlockableViewPager$b;", "Lcom/withings/wiscale2/activity/workout/ui/detail/r6$a;", "Lcom/withings/wiscale2/activity/workout/ui/detail/b7$a;", "Lcom/withings/wiscale2/activity/workout/ui/detail/u6$b;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class x1 extends a0 implements BlockableViewPager.b, r6.a, b7.a, u6.b {
    @Inject
    public y3 A;

    /* renamed from: l  reason: collision with root package name */
    private v f49784l;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f49786n;

    /* renamed from: o  reason: collision with root package name */
    private androidx.lifecycle.k0<Integer> f49787o;

    /* renamed from: p  reason: collision with root package name */
    private j3 f49788p;

    /* renamed from: q  reason: collision with root package name */
    private n4 f49789q;

    /* renamed from: r  reason: collision with root package name */
    private xa0.e f49790r;

    /* renamed from: s  reason: collision with root package name */
    private ab0.e0 f49791s;

    /* renamed from: t  reason: collision with root package name */
    private a5 f49792t;

    /* renamed from: u  reason: collision with root package name */
    private d5 f49793u;

    /* renamed from: v  reason: collision with root package name */
    private za0.d f49794v;

    /* renamed from: w  reason: collision with root package name */
    private za0.k f49795w;

    /* renamed from: x  reason: collision with root package name */
    private b7 f49796x;

    /* renamed from: y  reason: collision with root package name */
    private r6 f49797y;

    /* renamed from: z  reason: collision with root package name */
    private u6 f49798z;
    static final /* synthetic */ fn0.k<Object>[] F = {androidx.camera.core.v.c(x1.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(x1.class, "layout", "getLayout()Lcom/withings/wiscale2/databinding/FragmentWorkoutDetailBinding;", 0)};
    public static final a B = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final int f49780h = 180000;

    /* renamed from: i  reason: collision with root package name */
    private final g f49781i = new g(this);

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f49782j = nm0.h.b(new i());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f49783k = nm0.h.b(new b());

    /* renamed from: m  reason: collision with root package name */
    private final LifecycleViewBindingProperty f49785m = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* compiled from: WorkoutDetailFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static x1 a(User user, long j5, WorkoutCategory workoutCategory) {
            kotlin.jvm.internal.u.j(user, "user");
            x1 x1Var = new x1();
            x1Var.setArguments(androidx.core.os.e.a(new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user), new nm0.j("workoutId", Long.valueOf(j5)), new nm0.j("category", workoutCategory)));
            return x1Var;
        }
    }

    /* compiled from: WorkoutDetailFragment.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<WorkoutCategory> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final WorkoutCategory invoke() {
            Object parcelable;
            Bundle a11 = yq.b.a(x1.this);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = a11.getParcelable("category", WorkoutCategory.class);
            } else {
                parcelable = a11.getParcelable("category");
            }
            return (WorkoutCategory) parcelable;
        }
    }

    /* compiled from: WorkoutDetailFragment.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Bitmap, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FragmentActivity f49801b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FragmentActivity fragmentActivity) {
            super(1);
            this.f49801b = fragmentActivity;
        }

        @Override // ym0.l
        public final nm0.y invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            kotlin.jvm.internal.u.j(bitmap2, "bitmap");
            androidx.lifecycle.d0 viewLifecycleOwner = x1.this.getViewLifecycleOwner();
            kotlin.jvm.internal.u.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(viewLifecycleOwner), Dispatchers.getIO(), null, new d3(this.f49801b, bitmap2, null), 2, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutDetailFragment.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            int intValue = num.intValue();
            j3 j3Var = x1.this.f49788p;
            if (j3Var != null) {
                j3Var.o1().W0(intValue);
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutDetailFragment.kt */
    /* loaded from: classes4.dex */
    public static final class e implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f49803a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(ym0.l lVar) {
            this.f49803a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f49803a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f49803a;
        }

        public final int hashCode() {
            return this.f49803a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49803a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutDetailFragment.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            Integer num2 = num;
            if (num2 != null) {
                LockableScrollView scrollView = x1.this.Y1().f99144c;
                kotlin.jvm.internal.u.i(scrollView, "scrollView");
                scrollView.setScrollY(num2.intValue());
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes4.dex */
    public static final class g implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f49805a = nm0.h.b(new g3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f49806b;

        public g(Fragment fragment) {
            this.f49806b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f49805a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.l<x1, tb0.h3> {
        @Override // ym0.l
        public final tb0.h3 invoke(x1 x1Var) {
            x1 fragment = x1Var;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return tb0.h3.a(fragment.requireView());
        }
    }

    /* compiled from: WorkoutDetailFragment.kt */
    /* loaded from: classes4.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<Long> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(yq.b.a(x1.this).getLong("workoutId"));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public x1() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new wn.e(this, 2));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f49786n = registerForActivityResult;
    }

    public static final void A1(x1 x1Var) {
        LockableScrollView lockableScrollView = x1Var.Y1().f99144c;
        Context requireContext = x1Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        lockableScrollView.setScrollY(((int) x1Var.Y1().f99148g.b().getY()) - ah.g.k(48, requireContext));
    }

    public static final WorkoutCategory B1(x1 x1Var) {
        return (WorkoutCategory) x1Var.f49783k.getValue();
    }

    public static final long P1(x1 x1Var) {
        return ((Number) x1Var.f49782j.getValue()).longValue();
    }

    public static final void R1(x1 x1Var, boolean z5) {
        int i11;
        TextView workoutSwimEditedExplanation = (TextView) x1Var.Y1().f99147f.f99315h;
        kotlin.jvm.internal.u.i(workoutSwimEditedExplanation, "workoutSwimEditedExplanation");
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        workoutSwimEditedExplanation.setVisibility(i11);
    }

    public static final void U1(x1 x1Var, Integer num) {
        gl.x xVar;
        String str;
        x1Var.getClass();
        fl.o j5 = fl.p.f67672b.a().j(num.intValue());
        if (j5 instanceof gl.x) {
            xVar = (gl.x) j5;
        } else {
            xVar = null;
        }
        if (xVar != null) {
            Context requireContext = x1Var.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            str = xVar.X(requireContext);
        } else {
            str = null;
        }
        if (str == null) {
            a5 a5Var = x1Var.f49792t;
            if (a5Var != null) {
                a5Var.i(null);
                return;
            } else {
                kotlin.jvm.internal.u.s("heartRateView");
                throw null;
            }
        }
        a5 a5Var2 = x1Var.f49792t;
        if (a5Var2 != null) {
            a5Var2.i(new e3(x1Var, str));
        } else {
            kotlin.jvm.internal.u.s("heartRateView");
            throw null;
        }
    }

    public static final void V1(x1 x1Var) {
        za0.d dVar = x1Var.f49794v;
        if (dVar != null) {
            dVar.g(new f3(x1Var));
        } else {
            kotlin.jvm.internal.u.s("temperatureView");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r0 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void W1(final com.withings.wiscale2.activity.workout.ui.detail.x1 r5) {
        /*
            com.withings.wiscale2.activity.workout.ui.detail.j3 r0 = r5.f49788p
            if (r0 == 0) goto L83
            xw.p r0 = r0.s1()
            java.lang.Object r0 = r0.getValue()
            nm0.j r0 = (nm0.j) r0
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r0.c()
            com.withings.wiscale2.track.data.Track r0 = (com.withings.wiscale2.track.data.Track) r0
            if (r0 == 0) goto L2d
            tb0.h3 r1 = r5.Y1()
            com.withings.views.view.LockableScrollView r1 = r1.f99144c
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.u.i(r1, r2)
            android.util.SparseArray r0 = com.withings.wiscale2.track.data.TrackKt.deleteReasons(r0, r1)
            if (r0 != 0) goto L32
        L2d:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
        L32:
            int r1 = r0.size()
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            int r2 = r0.size()
            r3 = 0
            en0.k r2 = en0.r.w(r3, r2)
            en0.j r2 = r2.iterator()
        L45:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L56
            int r3 = r2.a()
            java.lang.Object r4 = r0.valueAt(r3)
            r1[r3] = r4
            goto L45
        L56:
            qc.b r2 = new qc.b
            android.content.Context r3 = r5.requireContext()
            r2.<init>(r3)
            r3 = 2132017587(0x7f1401b3, float:1.9673457E38)
            java.lang.String r3 = r5.getString(r3)
            qc.b r2 = r2.B(r3)
            com.withings.wiscale2.activity.workout.ui.detail.w1 r3 = new com.withings.wiscale2.activity.workout.ui.detail.w1
            r3.<init>()
            r2.u(r1, r3)
            com.withings.ecg.details.f r0 = new com.withings.ecg.details.f
            r1 = 2
            r0.<init>(r5, r1)
            r5 = 2132017507(0x7f140163, float:1.9673294E38)
            qc.b r5 = r2.w(r5, r0)
            r5.s()
            return
        L83:
            java.lang.String r5 = "viewModel"
            kotlin.jvm.internal.u.s(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.ui.detail.x1.W1(com.withings.wiscale2.activity.workout.ui.detail.x1):void");
    }

    public static final void X1(x1 x1Var, bb0.d1 d1Var) {
        nm0.y yVar;
        if (d1Var != null) {
            DefinitionView definitionView = x1Var.Y1().f99152k;
            kotlin.jvm.internal.u.g(definitionView);
            definitionView.setVisibility(0);
            definitionView.setMessage(d1Var.b());
            definitionView.setButtonText(d1Var.a());
            definitionView.setButtonClickListener(new h3(d1Var));
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            DefinitionView workoutBanner = x1Var.Y1().f99152k;
            kotlin.jvm.internal.u.i(workoutBanner, "workoutBanner");
            workoutBanner.setVisibility(8);
            return;
        }
        x1Var.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tb0.h3 Y1() {
        return (tb0.h3) this.f49785m.getValue(this, F[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2() {
        j3 j3Var = this.f49788p;
        if (j3Var != null) {
            nm0.j jVar = (nm0.j) j3Var.s1().getValue();
            if (jVar != null) {
                WorkoutCategory workoutCategory = (WorkoutCategory) jVar.b();
                int i11 = EditWorkoutActivity.S;
                Context requireContext = requireContext();
                kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                User user = getUser();
                Long id2 = ((Track) jVar.a()).getId();
                kotlin.jvm.internal.u.g(id2);
                startActivity(EditWorkoutActivity.a.a(requireContext, user, workoutCategory, id2.longValue(), false));
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2() {
        j3 j3Var = this.f49788p;
        if (j3Var != null) {
            j3Var.o1().V0();
            v vVar = this.f49784l;
            if (vVar != null) {
                vVar.dismiss();
            }
            j3 j3Var2 = this.f49788p;
            if (j3Var2 != null) {
                v vVar2 = new v(j3Var2.o1().z0(), new d());
                this.f49784l = vVar2;
                vVar2.show(getParentFragmentManager(), x1.class.getSimpleName());
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getUser() {
        return (User) this.f49781i.getValue(this, F[0]);
    }

    public static void s1(SparseArray array, x1 this$0, int i11) {
        kotlin.jvm.internal.u.j(array, "$array");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        int keyAt = array.keyAt(i11);
        j3 j3Var = this$0.f49788p;
        if (j3Var != null) {
            j3Var.V0(Integer.valueOf(keyAt));
            u6 u6Var = this$0.f49798z;
            if (u6Var != null) {
                u6Var.dismiss();
                return;
            } else {
                kotlin.jvm.internal.u.s("bottomSheetFragment");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static void t1(x1 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.b2();
    }

    public static void u1(x1 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        u6 u6Var = this$0.f49798z;
        if (u6Var != null) {
            u6Var.dismiss();
        } else {
            kotlin.jvm.internal.u.s("bottomSheetFragment");
            throw null;
        }
    }

    public static void v1(x1 this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f49787o;
        if (k0Var != null) {
            k0Var.setValue(Integer.valueOf(i11));
        }
    }

    public static void w1(x1 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        u6 u6Var = this$0.f49798z;
        if (u6Var != null) {
            u6Var.dismiss();
        } else {
            kotlin.jvm.internal.u.s("bottomSheetFragment");
            throw null;
        }
    }

    public static void x1(x1 this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        j3 j3Var = this$0.f49788p;
        if (j3Var != null) {
            j3Var.t1(1717, activityResult.b(), activityResult.a());
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    public static void y1(x1 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        j3 j3Var = this$0.f49788p;
        if (j3Var != null) {
            j3Var.V0(null);
            u6 u6Var = this$0.f49798z;
            if (u6Var != null) {
                u6Var.dismiss();
                return;
            } else {
                kotlin.jvm.internal.u.s("bottomSheetFragment");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static final void z1(x1 x1Var, String str) {
        TextView textView = (TextView) x1Var.Y1().f99147f.f99311d;
        textView.setText(str);
        textView.setVisibility(0);
        ImageView imageView = (ImageView) x1Var.Y1().f99147f.f99309b;
        kotlin.jvm.internal.u.g(imageView);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new sg.g(x1Var, 7));
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.b7.a
    public final void B0(b7 view) {
        kotlin.jvm.internal.u.j(view, "view");
        j3 j3Var = this.f49788p;
        if (j3Var != null) {
            j3Var.z1();
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.b7.a
    public final void G0(b7 view, w0 photoItem, int i11) {
        kotlin.jvm.internal.u.j(view, "view");
        kotlin.jvm.internal.u.j(photoItem, "photoItem");
        WorkoutPhotosActivity.a aVar = WorkoutPhotosActivity.f48995f;
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        long longValue = ((Number) this.f49782j.getValue()).longValue();
        aVar.getClass();
        Intent putExtra = new Intent(requireContext, WorkoutPhotosActivity.class).putExtra("workoutId", longValue).putExtra("extra_photo_index", i11);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        startActivity(putExtra);
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.u6.b
    public final void H(u6 workoutSheet) {
        kotlin.jvm.internal.u.j(workoutSheet, "workoutSheet");
        u6 u6Var = this.f49798z;
        if (u6Var != null) {
            u6Var.dismiss();
            j3 j3Var = this.f49788p;
            if (j3Var != null) {
                j3Var.z1();
                return;
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("bottomSheetFragment");
        throw null;
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.b7.a
    public final void I0(b7 view, w0 photoItem) {
        kotlin.jvm.internal.u.j(view, "view");
        kotlin.jvm.internal.u.j(photoItem, "photoItem");
        j3 j3Var = this.f49788p;
        if (j3Var != null) {
            j3Var.C1(photoItem);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.u6.b
    public final void K(u6 workoutSheet) {
        kotlin.jvm.internal.u.j(workoutSheet, "workoutSheet");
        u6 u6Var = this.f49798z;
        if (u6Var != null) {
            u6Var.dismiss();
            j3 j3Var = this.f49788p;
            if (j3Var != null) {
                WorkoutCategory workoutCategory = (WorkoutCategory) j3Var.W0().getValue();
                if (workoutCategory != null) {
                    long id2 = workoutCategory.getId();
                    int i11 = WorkoutGoalActivity.f48710g;
                    Context requireContext = requireContext();
                    kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                    startActivity(WorkoutGoalActivity.a.a(id2, requireContext, getUser()));
                    return;
                }
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("bottomSheetFragment");
        throw null;
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.u6.b
    public final void L(u6 workoutSheet) {
        kotlin.jvm.internal.u.j(workoutSheet, "workoutSheet");
        j3 j3Var = this.f49788p;
        if (j3Var != null) {
            j3Var.y1();
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        BlockableViewPager.b bVar;
        FragmentActivity activity = getActivity();
        if (activity instanceof BlockableViewPager.b) {
            bVar = (BlockableViewPager.b) activity;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            bVar.Q1(z5);
        }
    }

    public final androidx.lifecycle.k0<Integer> Z1() {
        return this.f49787o;
    }

    public final void c2(androidx.lifecycle.k0<Integer> k0Var) {
        androidx.lifecycle.k0<Integer> k0Var2 = this.f49787o;
        if (k0Var2 != null) {
            k0Var2.removeObservers(this);
        }
        this.f49787o = k0Var;
        if (k0Var != null) {
            k0Var.observe(this, new e(new f()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x016c, code lost:
        if (r0 == null) goto L67;
     */
    @Override // com.withings.wiscale2.activity.workout.ui.detail.r6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h1(com.withings.wiscale2.activity.workout.ui.detail.r6 r10, com.withings.wiscale2.activity.workout.ui.detail.x5 r11) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.ui.detail.x1.h1(com.withings.wiscale2.activity.workout.ui.detail.r6, com.withings.wiscale2.activity.workout.ui.detail.x5):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        j3 j3Var = this.f49788p;
        if (j3Var != null) {
            j3Var.t1(i11, i12, intent);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.u.j(menu, "menu");
        kotlin.jvm.internal.u.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(C1987R.menu.menu_fragment_workout_detail, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ab0.e0 e0Var = this.f49791s;
        if (e0Var != null) {
            e0Var.f();
            a5 a5Var = this.f49792t;
            if (a5Var != null) {
                a5Var.f();
                za0.d dVar = this.f49794v;
                if (dVar != null) {
                    dVar.e();
                    super.onDestroyView();
                    return;
                }
                kotlin.jvm.internal.u.s("temperatureView");
                throw null;
            }
            kotlin.jvm.internal.u.s("heartRateView");
            throw null;
        }
        kotlin.jvm.internal.u.s("performanceView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        DateTime now;
        Track track;
        kotlin.jvm.internal.u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == C1987R.id.action_share) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return true;
            }
            Window window = activity.getWindow();
            kotlin.jvm.internal.u.i(window, "getWindow(...)");
            LinearLayout sharable = Y1().f99151j;
            kotlin.jvm.internal.u.i(sharable, "sharable");
            o40.b.a(window, sharable, new c(activity));
            return true;
        } else if (itemId == C1987R.id.action_display_bottom_sheet) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            kotlin.jvm.internal.u.i(parentFragmentManager, "getParentFragmentManager(...)");
            j3 j3Var = this.f49788p;
            if (j3Var != null) {
                nm0.j jVar = (nm0.j) j3Var.s1().getValue();
                if (jVar == null || (track = (Track) jVar.c()) == null || (now = track.getStartDate()) == null) {
                    now = DateTime.now();
                }
                u6.a aVar = u6.f49698g;
                User user = getUser();
                kotlin.jvm.internal.u.g(now);
                aVar.getClass();
                kotlin.jvm.internal.u.j(user, "user");
                u6 u6Var = new u6();
                u6Var.setArguments(androidx.core.os.e.a(new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user), new nm0.j(FoodDayFragment.ARG_DAY, now)));
                u6Var.y1(this);
                u6Var.show(parentFragmentManager, u6.class.getSimpleName());
                this.f49798z = u6Var;
                return true;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        j3 j3Var = this.f49788p;
        if (j3Var != null) {
            j3Var.v1(i11, permissions, grantResults);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer value;
        Integer value2;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        ConstraintLayout b10 = Y1().f99145d.b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        this.f49789q = new n4(b10, new y1(this));
        StatBarLayout b11 = Y1().f99149h.b();
        kotlin.jvm.internal.u.i(b11, "getRoot(...)");
        this.f49790r = new xa0.e(b11);
        LifecycleCoroutineScopeImpl l5 = m0.t.l(this);
        long longValue = ((Number) this.f49782j.getValue()).longValue();
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        this.f49791s = new ab0.e0(view, l5, longValue, a.d.a(requireContext), this);
        this.f49792t = new a5(view, this, m0.t.l(this));
        LinearLayout b12 = Y1().f99146e.b();
        kotlin.jvm.internal.u.i(b12, "getRoot(...)");
        this.f49793u = new d5(b12);
        LinearLayout b13 = Y1().f99150i.b();
        kotlin.jvm.internal.u.i(b13, "getRoot(...)");
        this.f49795w = new za0.k(b13, m0.t.l(this));
        this.f49794v = new za0.d(view, this, m0.t.l(this));
        LinearLayout b14 = Y1().f99148g.b();
        kotlin.jvm.internal.u.i(b14, "getRoot(...)");
        this.f49796x = new b7(b14, this);
        this.f49797y = new r6(view, this);
        Y1().f99143b.setListener(new z1(this));
        j3 j3Var = (j3) new androidx.lifecycle.k1(this, new c2(this)).a(j3.class);
        j3Var.d1().observe(getViewLifecycleOwner(), new e(new o2(this)));
        j3Var.n1().observe(getViewLifecycleOwner(), new e(new v2(this)));
        j3Var.o1().A0().observe(getViewLifecycleOwner(), new e(new w2(this)));
        j3Var.o1().B0().observe(getViewLifecycleOwner(), new e(new x2(this)));
        j3Var.o1().T0().observe(getViewLifecycleOwner(), new e(new y2(this)));
        j3Var.o1().U0().observe(getViewLifecycleOwner(), new e(new z2(this)));
        xw.n<nm0.y> F0 = j3Var.o1().F0();
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.u.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        F0.v(viewLifecycleOwner, new a3(this));
        j3Var.o1().G0().observe(getViewLifecycleOwner(), new e(new b3(this)));
        j3Var.s1().observe(getViewLifecycleOwner(), new e(new c3(this)));
        j3Var.Z0().observe(getViewLifecycleOwner(), new e(new d2(this)));
        j3Var.o1().M0().observe(getViewLifecycleOwner(), new e(new e2(this)));
        j3Var.c1().observe(getViewLifecycleOwner(), new e(new f2(this)));
        j3Var.o1().O0().observe(getViewLifecycleOwner(), new e(new g2(this)));
        j3Var.a1().observe(getViewLifecycleOwner(), new e(new h2(this)));
        j3Var.o1().K0().observe(getViewLifecycleOwner(), new e(new i2(this)));
        j3Var.o1().R0().observe(getViewLifecycleOwner(), new e(new j2(this)));
        j3Var.g1().observe(getViewLifecycleOwner(), new e(new k2(this)));
        j3Var.q1().observe(getViewLifecycleOwner(), new e(new m2(j3Var, this)));
        j3Var.e1().observe(getViewLifecycleOwner(), new e(new n2(this)));
        j3Var.i1().observe(getViewLifecycleOwner(), new e(new p2(this)));
        j3Var.m1().observe(getViewLifecycleOwner(), new e(new q2(this)));
        j3Var.Y0().observe(getViewLifecycleOwner(), new e(new r2(this)));
        j3Var.l1().observe(getViewLifecycleOwner(), new e(new s2(this)));
        j3Var.k1().observe(getViewLifecycleOwner(), new e(new t2(this)));
        j3Var.X0().observe(getViewLifecycleOwner(), new e(new u2(this)));
        this.f49788p = j3Var;
        androidx.lifecycle.k0<Integer> k0Var = this.f49787o;
        if (k0Var != null && (value2 = k0Var.getValue()) != null) {
            Y1().f99144c.setScrollY(value2.intValue());
        }
        Y1().f99144c.setOnScrollChangeListener(new com.google.firebase.remoteconfig.e(this));
        LockableScrollView scrollView = Y1().f99144c;
        kotlin.jvm.internal.u.i(scrollView, "scrollView");
        if (androidx.core.view.u0.L(scrollView) && !scrollView.isLayoutRequested()) {
            androidx.lifecycle.k0<Integer> k0Var2 = this.f49787o;
            if (k0Var2 != null && (value = k0Var2.getValue()) != null) {
                Y1().f99144c.setScrollY(value.intValue());
                return;
            }
            return;
        }
        scrollView.addOnLayoutChangeListener(new b2(this));
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.u6.b
    public final void v0(u6 workoutSheet) {
        kotlin.jvm.internal.u.j(workoutSheet, "workoutSheet");
        u6 u6Var = this.f49798z;
        if (u6Var != null) {
            u6Var.dismiss();
            a2();
            return;
        }
        kotlin.jvm.internal.u.s("bottomSheetFragment");
        throw null;
    }
}
