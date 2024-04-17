package com.withings.views.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: HorizontalSausageWithLegendsView.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/withings/views/view/HorizontalSausageWithLegendsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lcom/withings/views/view/HorizontalSausageWithLegendsView$b;", "legends", "Lnm0/y;", "setLegends", "(Ljava/util/List;)V", "Lcom/withings/views/view/HorizontalSausageWithLegendsView$a;", ConstantsWs.JSON_SESSION_KEY_WEIGHTUNIT, "Lcom/withings/views/view/HorizontalSausageWithLegendsView$a;", "getExpandableLegendListener", "()Lcom/withings/views/view/HorizontalSausageWithLegendsView$a;", "setExpandableLegendListener", "(Lcom/withings/views/view/HorizontalSausageWithLegendsView$a;)V", "expandableLegendListener", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HorizontalSausageWithLegendsView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private HorizontalSausageView f46566t;

    /* renamed from: u  reason: collision with root package name */
    private LinearLayout f46567u;

    /* renamed from: v  reason: collision with root package name */
    private List<b> f46568v;

    /* renamed from: w  reason: collision with root package name */
    private a f46569w;

    /* compiled from: HorizontalSausageWithLegendsView.kt */
    /* loaded from: classes4.dex */
    public interface a {
        void a(ExpandableLineCellView expandableLineCellView, b bVar);
    }

    /* compiled from: HorizontalSausageWithLegendsView.kt */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private int f46570a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f46571b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f46572c;

        /* renamed from: d  reason: collision with root package name */
        private float f46573d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f46574e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f46575f;

        /* renamed from: g  reason: collision with root package name */
        private CharSequence f46576g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f46577h;

        public b(int i11, CharSequence label, String displayedValue, float f11, boolean z5, int i12) {
            z5 = (i12 & 32) != 0 ? false : z5;
            u.j(label, "label");
            u.j(displayedValue, "displayedValue");
            this.f46570a = i11;
            this.f46571b = label;
            this.f46572c = displayedValue;
            this.f46573d = f11;
            this.f46574e = false;
            this.f46575f = z5;
        }

        public final int a() {
            return this.f46570a;
        }

        public final CharSequence b() {
            return this.f46572c;
        }

        public final boolean c() {
            return this.f46574e;
        }

        public final CharSequence d() {
            return this.f46577h;
        }

        public final CharSequence e() {
            return this.f46576g;
        }

        public final CharSequence f() {
            return this.f46571b;
        }

        public final float g() {
            return this.f46573d;
        }

        public final boolean h() {
            return this.f46575f;
        }

        public final void i() {
            this.f46575f = false;
        }

        public final void j(String str, String str2) {
            this.f46576g = str;
            this.f46577h = str2;
        }

        public final void k() {
            this.f46574e = true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalSausageWithLegendsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public static void t(HorizontalSausageWithLegendsView this$0, ExpandableLineCellView this_apply, b legend) {
        u.j(this$0, "this$0");
        u.j(this_apply, "$this_apply");
        u.j(legend, "$legend");
        a aVar = this$0.f46569w;
        if (aVar != null) {
            aVar.a(this_apply, legend);
        }
    }

    private final void u(b bVar, LineCellView lineCellView) {
        if (bVar.c()) {
            Context context = getContext();
            u.i(context, "getContext(...)");
            int k11 = ah.g.k(10, context);
            int color = androidx.core.content.a.getColor(getContext(), C1987R.color.statusInfo);
            Context context2 = getContext();
            u.i(context2, "getContext(...)");
            lineCellView.setLabelIcon(y70.b.c(context2, k11, color, k11));
        } else {
            lineCellView.x(C1987R.drawable.dot_10_dp, bVar.a());
        }
        lineCellView.setLabel(bVar.f());
        lineCellView.setValue(bVar.b());
    }

    public final a getExpandableLegendListener() {
        return this.f46569w;
    }

    public final void setExpandableLegendListener(a aVar) {
        this.f46569w = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.withings.views.view.ExpandableLineCellView, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.LinearLayout, android.view.ViewGroup] */
    public final void setLegends(List<b> legends) {
        boolean z5;
        ?? r32;
        u.j(legends, "legends");
        this.f46568v = legends;
        ?? r82 = this.f46567u;
        r82.removeAllViews();
        for (b bVar : this.f46568v) {
            if (bVar.e() != null && bVar.h()) {
                Context context = getContext();
                u.i(context, "getContext(...)");
                r32 = new ExpandableLineCellView(context, null, 6, 0);
                u(bVar, r32.getLineCellView());
                CharSequence e11 = bVar.e();
                CharSequence charSequence = "";
                if (e11 == null) {
                    e11 = "";
                }
                r32.setInfoTitle(e11);
                CharSequence d11 = bVar.d();
                if (d11 != null) {
                    charSequence = d11;
                }
                r32.setInfoDetail(charSequence);
                r32.setOnClickListener(new e(this, r32, bVar, 0));
            } else {
                LineCellView lineCellView = new LineCellView(getContext());
                u(bVar, lineCellView);
                lineCellView.setBottomDividerVisibility(true);
                r32 = lineCellView;
            }
            r82.addView(r32);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f46568v) {
            if (((b) obj).g() == -1.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            arrayList2.add(new c(bVar2.g(), bVar2.a(), bVar2.c()));
        }
        this.f46566t.setValues(arrayList2);
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalSausageWithLegendsView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f46568v = i0.f76187a;
        View inflate = View.inflate(context, C1987R.layout.view_horizontal_sausage_with_legends, this);
        View findViewById = inflate.findViewById(C1987R.id.horizontal_sausage);
        u.i(findViewById, "findViewById(...)");
        this.f46566t = (HorizontalSausageView) findViewById;
        View findViewById2 = inflate.findViewById(C1987R.id.legends);
        u.i(findViewById2, "findViewById(...)");
        this.f46567u = (LinearLayout) findViewById2;
        if (isInEditMode()) {
            setLegends(x.W(new b(C1987R.color.statusUndefined, "This", "10%", 10.0f, false, 48), new b(C1987R.color.statusInfo, "is", "40%", 40.0f, false, 48), new b(C1987R.color.heart, "for", "30%", 30.0f, false, 48), new b(C1987R.color.datavizMonochromaticNeutral2, "testing", "20%", 20.0f, false, 48)));
        }
    }
}
