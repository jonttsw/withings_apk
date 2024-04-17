package com.withings.ecg.graph;

import a1.x;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import androidx.core.view.u0;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import lb.i;
import org.joda.time.DateTime;
/* compiled from: EcgLineChart.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002RSB'\b\u0007\u0012\u0006\u0010L\u001a\u00020K\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M\u0012\b\b\u0002\u0010O\u001a\u00020\u0003¢\u0006\u0004\bP\u0010QJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\fR$\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0007R\"\u00100\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010\u0007R\"\u00104\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010D\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00103\u001a\u0004\bD\u00105\"\u0004\bE\u00107R*\u0010J\u001a\u0002012\u0006\u0010F\u001a\u0002018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00103\u001a\u0004\bH\u00105\"\u0004\bI\u00107¨\u0006T"}, d2 = {"Lcom/withings/ecg/graph/EcgLineChart;", "Lcom/github/mikephil/charting/charts/LineChart;", "Landroid/view/Choreographer$FrameCallback;", "", "lineColor", "Lnm0/y;", "setLineColor", "(I)V", "", "Lcom/withings/ecg/graph/EcgEntry;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "setEntries", "(Ljava/util/List;)V", "Lcom/withings/ecg/graph/EcgLineChart$b;", "dataAnimationListener", "setDataAnimationListener", "(Lcom/withings/ecg/graph/EcgLineChart$b;)V", "", "duration", "setDuration", "(J)V", "", "viewHeight", "setVerticalRange$ecg_release", "(F)V", "setVerticalRange", "H0", "Ljava/util/List;", "getGraphScale$ecg_release", "()Ljava/util/List;", "setGraphScale$ecg_release", "graphScale", "T0", "Ljava/lang/Integer;", "getBackgroundColorRes", "()Ljava/lang/Integer;", "setBackgroundColorRes", "(Ljava/lang/Integer;)V", "backgroundColorRes", "U0", "I", "getSmallLineColor", "()I", "setSmallLineColor", "smallLineColor", "V0", "getBigLineColor", "setBigLineColor", "bigLineColor", "", "W0", "Z", "isBigGridEnabled", "()Z", "setBigGridEnabled", "(Z)V", "X0", "isSmallGridEnabled", "setSmallGridEnabled", "Lcom/withings/ecg/graph/EcgLineChart$c;", "Y0", "Lcom/withings/ecg/graph/EcgLineChart$c;", "getZoomOutMoreListener", "()Lcom/withings/ecg/graph/EcgLineChart$c;", "setZoomOutMoreListener", "(Lcom/withings/ecg/graph/EcgLineChart$c;)V", "zoomOutMoreListener", "Z0", "isFullScreen", "setFullScreen", "value", "a1", "b0", "setGridEnabled", "isGridEnabled", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcgLineChart extends LineChart implements Choreographer.FrameCallback {

    /* renamed from: b1  reason: collision with root package name */
    public static final /* synthetic */ int f38387b1 = 0;
    private List<EcgEntry> H0;
    private final Choreographer I0;
    private Long J0;
    private float K0;
    private float L0;
    private float M0;
    private long N0;
    private float O0;
    private int P0;
    private float Q0;
    private boolean R0;
    private b S0;
    private Integer T0;
    private int U0;
    private int V0;
    private boolean W0;
    private boolean X0;
    private c Y0;
    private boolean Z0;

    /* renamed from: a1  reason: collision with root package name */
    private boolean f38388a1;

    /* compiled from: EcgLineChart.kt */
    /* loaded from: classes3.dex */
    public static final class a extends mb.c {
        @Override // mb.c
        public final String a(float f11) {
            return x.b((int) f11, "s");
        }
    }

    /* compiled from: EcgLineChart.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void Z();
    }

    /* compiled from: EcgLineChart.kt */
    /* loaded from: classes3.dex */
    public interface c {
        void a(boolean z5);
    }

    /* compiled from: View.kt */
    /* loaded from: classes3.dex */
    public static final class d implements View.OnLayoutChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f38390b;

        public d(long j5) {
            this.f38390b = j5;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            view.removeOnLayoutChangeListener(this);
            EcgLineChart ecgLineChart = EcgLineChart.this;
            ecgLineChart.L0 = ecgLineChart.M0 + ((((i) ecgLineChart.getData()).m() * ((float) this.f38390b)) / ((float) (ecgLineChart.N0 * 1000)));
            ecgLineChart.I(ecgLineChart.L0);
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes3.dex */
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f38392b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f38393c;

        public e(float f11, float f12) {
            this.f38392b = f11;
            this.f38393c = f12;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            view.removeOnLayoutChangeListener(this);
            EcgLineChart ecgLineChart = EcgLineChart.this;
            boolean F = ecgLineChart.F();
            float f11 = this.f38392b;
            if (F) {
                ecgLineChart.e0(view.getMeasuredWidth(), f11);
            }
            if (ecgLineChart.b0()) {
                EcgLineChart.Q(ecgLineChart, this.f38393c, f11);
            }
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes3.dex */
    public static final class f implements View.OnLayoutChangeListener {
        public f() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            view.removeOnLayoutChangeListener(this);
            EcgLineChart.this.setVerticalRange$ecg_release(view.getMeasuredHeight());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcgLineChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    public static void P(EcgLineChart this$0) {
        u.j(this$0, "this$0");
        boolean c11 = this$0.getViewPortHandler().c();
        if (c11 != this$0.R0) {
            this$0.R0 = c11;
            c cVar = this$0.Y0;
            if (cVar != null) {
                cVar.a(c11);
            }
        }
    }

    public static final void Q(EcgLineChart ecgLineChart, float f11, float f12) {
        XAxis xAxis = ecgLineChart.getXAxis();
        xAxis.C();
        if (ecgLineChart.X0) {
            Y(xAxis, f11, f12, 25.0f, ecgLineChart.U0, 0.5f);
        }
        if (ecgLineChart.W0) {
            Y(xAxis, f11, f12, 5.0f, ecgLineChart.V0, 1.0f);
        }
        if (ecgLineChart.Z0) {
            YAxis axisLeft = ecgLineChart.getAxisLeft();
            axisLeft.C();
            Context context = ecgLineChart.getContext();
            u.i(context, "getContext(...)");
            float n11 = ecgLineChart.getAxisLeft().B / wq.a.n(ecgLineChart.getMeasuredHeight(), context);
            if (ecgLineChart.X0) {
                X(axisLeft, n11 * 1.0f, ecgLineChart.U0, 0.5f);
            }
            if (ecgLineChart.W0) {
                X(axisLeft, 5 * n11, ecgLineChart.V0, 1.0f);
                return;
            }
            return;
        }
        Context context2 = ecgLineChart.getContext();
        u.i(context2, "getContext(...)");
        ecgLineChart.setBackground(new oq.a(context2, ecgLineChart.W0, ecgLineChart.X0, ecgLineChart.U0, ecgLineChart.V0, ecgLineChart.T0));
    }

    private static void W(YAxis yAxis, float f11, int i11, float f12) {
        LimitLine limitLine = new LimitLine(f11);
        limitLine.s(i11);
        limitLine.t(f12);
        yAxis.m(limitLine);
    }

    private static void X(YAxis yAxis, float f11, int i11, float f12) {
        float f13 = 0.0f;
        W(yAxis, 0.0f, i11, f12);
        float f14 = f11 + 0.0f;
        while (f14 <= yAxis.f75813z) {
            W(yAxis, f14, i11, f12);
            f14 += f11;
        }
        while (true) {
            f13 -= f11;
            if (f13 >= yAxis.A) {
                W(yAxis, f13, i11, f12);
            } else {
                return;
            }
        }
    }

    private static void Y(XAxis xAxis, float f11, float f12, float f13, int i11, float f14) {
        int i12 = ((int) (f12 * f13)) + 1;
        for (int i13 = 0; i13 < i12; i13++) {
            LimitLine limitLine = new LimitLine((i13 / f13) + f11);
            limitLine.s(i11);
            limitLine.t(f14);
            xAxis.m(limitLine);
        }
    }

    public final void V(int i11, float f11, boolean z5, LineDataSet.Mode lineMode) {
        u.j(lineMode, "lineMode");
        i iVar = (i) getData();
        if (iVar != null) {
            LineDataSet lineDataSet = new LineDataSet(null, null);
            lineDataSet.T0(lineMode);
            lineDataSet.S0(z5);
            lineDataSet.H0();
            lineDataSet.I0();
            lineDataSet.F0();
            lineDataSet.G0(i11);
            lineDataSet.O0(lineDataSet.getColor());
            lineDataSet.P0(lineDataSet.getColor());
            lineDataSet.Q0();
            lineDataSet.N0(f11);
            iVar.a(lineDataSet);
        }
    }

    public final void Z(float f11) {
        this.K0 = f11;
        if (u0.L(this) && !isLayoutRequested()) {
            M(0.0f, f11);
        } else {
            addOnLayoutChangeListener(new oq.b(this, f11));
        }
    }

    public final void a0() {
        pb.f fVar;
        i iVar = (i) getData();
        if (iVar != null) {
            fVar = (pb.f) iVar.g(0);
        } else {
            fVar = null;
        }
        if (fVar == null) {
            V(androidx.core.content.a.getColor(getContext(), this.P0), this.O0, false, LineDataSet.Mode.f24364c);
        }
    }

    public final boolean b0() {
        return this.f38388a1;
    }

    public final void c0() {
        this.I0.removeFrameCallback(this);
        this.M0 = this.L0;
    }

    public final void d0(float f11, float f12) {
        if (u0.L(this) && !isLayoutRequested()) {
            if (F()) {
                e0(getMeasuredWidth(), f12);
            }
            if (this.f38388a1) {
                Q(this, f11, f12);
                return;
            }
            return;
        }
        addOnLayoutChangeListener(new e(f12, f11));
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        Long l5 = this.J0;
        if (l5 != null) {
            long millis = DateTime.now().getMillis() - l5.longValue();
            if (u0.L(this) && !isLayoutRequested()) {
                float m11 = ((((i) getData()).m() * ((float) millis)) / ((float) (this.N0 * 1000))) + this.M0;
                this.L0 = m11;
                I(m11);
            } else {
                addOnLayoutChangeListener(new d(millis));
            }
            if (this.L0 >= ((i) getData()).m() - this.K0) {
                b bVar = this.S0;
                if (bVar != null) {
                    bVar.Z();
                }
                g0();
                return;
            }
            this.I0.postFrameCallback(this);
        }
    }

    public final void e0(float f11, float f12) {
        Context context = getContext();
        u.i(context, "getContext(...)");
        this.Q0 = f12 / (wq.a.n(f11, context) / 25.0f);
        getViewPortHandler().P(this.Q0);
    }

    public final void f0() {
        this.J0 = Long.valueOf(DateTime.now().getMillis());
        this.I0.postFrameCallback(this);
    }

    public final void g0() {
        if (u0.L(this) && !isLayoutRequested()) {
            animate().alpha(0.0f).setDuration(250L).setListener(new com.withings.ecg.graph.d(this));
        } else {
            addOnLayoutChangeListener(new com.withings.ecg.graph.c(this));
        }
        this.M0 = 0.0f;
        this.L0 = 0.0f;
        this.I0.removeFrameCallback(this);
    }

    public final Integer getBackgroundColorRes() {
        return this.T0;
    }

    public final int getBigLineColor() {
        return this.V0;
    }

    public final List<EcgEntry> getGraphScale$ecg_release() {
        return this.H0;
    }

    public final int getSmallLineColor() {
        return this.U0;
    }

    public final c getZoomOutMoreListener() {
        return this.Y0;
    }

    @Override // com.github.mikephil.charting.charts.LineChart, com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        g0();
        g();
        this.S0 = null;
        this.Y0 = null;
        super.onDetachedFromWindow();
    }

    public final void setBackgroundColorRes(Integer num) {
        this.T0 = num;
    }

    public final void setBigGridEnabled(boolean z5) {
        this.W0 = z5;
    }

    public final void setBigLineColor(int i11) {
        this.V0 = i11;
    }

    public final void setDataAnimationListener(b dataAnimationListener) {
        u.j(dataAnimationListener, "dataAnimationListener");
        this.S0 = dataAnimationListener;
    }

    public final void setDuration(long j5) {
        this.N0 = j5;
    }

    public final void setEntries(List<EcgEntry> entries) {
        List<EcgEntry> list;
        float e11;
        u.j(entries, "entries");
        if (u0.L(this) && !isLayoutRequested()) {
            setVerticalRange$ecg_release(getMeasuredHeight());
        } else {
            addOnLayoutChangeListener(new f());
        }
        ((i) getData()).f();
        a0();
        List<EcgEntry> list2 = this.H0;
        if (list2 != null) {
            V(androidx.core.content.a.getColor(getContext(), this.P0), this.O0, false, LineDataSet.Mode.f24362a);
            for (EcgEntry ecgEntry : list2) {
                ((i) getData()).b(ecgEntry, ((i) getData()).h() - 1);
            }
        }
        if (!entries.isEmpty()) {
            list = entries;
        } else {
            list = null;
        }
        if (list != null) {
            ((i) getData()).s();
            for (EcgEntry ecgEntry2 : entries) {
                ((i) getData()).b(ecgEntry2, 0);
            }
            p();
            if (this.H0 != null) {
                e11 = 0.0f;
            } else {
                e11 = ((EcgEntry) kotlin.collections.x.I(entries)).e();
            }
            d0(e11, ((EcgEntry) kotlin.collections.x.T(entries)).e() - e11);
            invalidate();
        }
    }

    public final void setFullScreen(boolean z5) {
        this.Z0 = z5;
    }

    public final void setGraphScale$ecg_release(List<EcgEntry> list) {
        this.H0 = list;
    }

    public final void setGridEnabled(boolean z5) {
        this.f38388a1 = z5;
        if (!z5) {
            getAxisLeft().C();
            getXAxis().C();
        }
    }

    public final void setLineColor(int i11) {
        pb.f fVar;
        this.P0 = i11;
        i iVar = (i) getData();
        if (iVar != null) {
            fVar = (pb.f) iVar.g(0);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            LineDataSet lineDataSet = (LineDataSet) fVar;
            lineDataSet.G0(androidx.core.content.a.getColor(getContext(), this.P0));
            lineDataSet.N0(this.O0);
            lineDataSet.T0(LineDataSet.Mode.f24364c);
        }
    }

    public final void setSmallGridEnabled(boolean z5) {
        this.X0 = z5;
    }

    public final void setSmallLineColor(int i11) {
        this.U0 = i11;
    }

    public final void setVerticalRange$ecg_release(float f11) {
        Context context = getContext();
        u.i(context, "getContext(...)");
        float n11 = (wq.a.n(f11, context) * 100.0f) / 2.0f;
        YAxis axisLeft = getAxisLeft();
        axisLeft.E(-n11);
        axisLeft.D(n11);
    }

    public final void setZoomOutMoreListener(c cVar) {
        this.Y0 = cVar;
    }

    public /* synthetic */ EcgLineChart(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v3, types: [mb.c, com.withings.ecg.graph.EcgLineChart$a] */
    public EcgLineChart(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.I0 = Choreographer.getInstance();
        this.O0 = 2.0f;
        this.P0 = C1987R.color.statusInfo;
        this.Q0 = 1.0f;
        this.T0 = Integer.valueOf(ah.u.w(C1987R.attr.colorSurface, context, -65281));
        this.U0 = androidx.core.content.a.getColor(context, C1987R.color.background3);
        this.V0 = androidx.core.content.a.getColor(context, C1987R.color.background3);
        this.W0 = true;
        this.X0 = true;
        getDescription().g(false);
        setData(new i());
        getLegend().D();
        getAxisRight().g(false);
        XAxis xAxis = getXAxis();
        xAxis.I();
        xAxis.P();
        xAxis.g(true);
        xAxis.Q(XAxis.XAxisPosition.f24336e);
        xAxis.F();
        xAxis.G();
        xAxis.H(true);
        TextPaint k11 = wq.a.k(C1987R.style.detail1, context, 14);
        xAxis.h(k11.getColor());
        xAxis.i(wq.a.m(k11.getTextSize(), context));
        xAxis.j(k11.getTypeface());
        xAxis.l();
        xAxis.M(new mb.c());
        YAxis axisLeft = getAxisLeft();
        axisLeft.I();
        axisLeft.g(true);
        axisLeft.F();
        axisLeft.G();
        axisLeft.H(false);
        axisLeft.X();
        axisLeft.W();
        L();
        a0();
        setOnTouchListener(new com.google.android.material.search.i(this, 1));
        setXAxisRenderer(new oq.c(this));
    }
}
