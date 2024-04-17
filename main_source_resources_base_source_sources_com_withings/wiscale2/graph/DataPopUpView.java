package com.withings.wiscale2.graph;

import ah.u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.camera.camera2.internal.o0;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.graph.DataPopUpView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
import ym0.l;
/* compiled from: DataPopUpView.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0010\u0018B'\b\u0007\u0012\u0006\u0010T\u001a\u00020S\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010U\u0012\b\b\u0002\u0010W\u001a\u00020)¢\u0006\u0004\bX\u0010YJ'\u0010\t\u001a\u00020\b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\t\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00105\u001a\u00020)2\u0006\u00101\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-\"\u0004\b4\u0010/R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\b=\u0010:R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bA\u0010BR\u001b\u0010F\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00108\u001a\u0004\bE\u0010BR\u001b\u0010I\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00108\u001a\u0004\bH\u0010-R\u001b\u0010L\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00108\u001a\u0004\bK\u0010\rR\u001b\u0010O\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u00108\u001a\u0004\bN\u0010-R\u001b\u0010R\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u00108\u001a\u0004\bQ\u0010\r¨\u0006Z"}, d2 = {"Lcom/withings/wiscale2/graph/DataPopUpView;", "Landroid/view/View;", "Lys/g;", "Lkotlin/Function1;", "Lrs/e;", "", "Lqf0/b;", "contentProvider", "Lnm0/y;", "setContentProvider", "(Lym0/l;)V", "", "getMaxWidth", "()F", "getBackgroundHeight", "Lcom/withings/wiscale2/graph/DataPopUpView$b;", "a", "Lcom/withings/wiscale2/graph/DataPopUpView$b;", "getOnPopupClickListener", "()Lcom/withings/wiscale2/graph/DataPopUpView$b;", "setOnPopupClickListener", "(Lcom/withings/wiscale2/graph/DataPopUpView$b;)V", "onPopupClickListener", "Lcom/withings/wiscale2/graph/DataPopUpView$a;", com.huawei.hms.feature.dynamic.e.b.f28627a, "Lcom/withings/wiscale2/graph/DataPopUpView$a;", "getContentProvider", "()Lcom/withings/wiscale2/graph/DataPopUpView$a;", "(Lcom/withings/wiscale2/graph/DataPopUpView$a;)V", "", "c", "Z", "getShouldShowLine", "()Z", "setShouldShowLine", "(Z)V", "shouldShowLine", "d", "getShouldLineMatchContentRectBottom", "setShouldLineMatchContentRectBottom", "shouldLineMatchContentRectBottom", "", com.huawei.hms.feature.dynamic.e.e.f28630a, "I", "getBottomPadding", "()I", "setBottomPadding", "(I)V", "bottomPadding", "value", "f", "getPositionMode", "setPositionMode", "positionMode", "Landroid/graphics/Paint;", ConstantsWs.JSON_SESSION_KEY_GCONST, "Lnm0/g;", "getBackgroundPaint", "()Landroid/graphics/Paint;", "backgroundPaint", "h", "getSeparatorPaint", "separatorPaint", "Landroid/text/TextPaint;", "i", "getTitleTextPaint", "()Landroid/text/TextPaint;", "titleTextPaint", "j", "getValueTextPaint", "valueTextPaint", "k", "getTextMargin", "textMargin", "l", "getBackgroundRadius", "backgroundRadius", "m", "getPointerSize", "pointerSize", "n", "getSeparatorWidth", "separatorWidth", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DataPopUpView extends View implements ys.g {

    /* renamed from: u  reason: collision with root package name */
    private static final int f56129u = u.j(0.2f, -16777216);

    /* renamed from: a  reason: collision with root package name */
    private b f56130a;

    /* renamed from: b  reason: collision with root package name */
    private a f56131b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56132c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f56133d;

    /* renamed from: e  reason: collision with root package name */
    private int f56134e;

    /* renamed from: f  reason: collision with root package name */
    private int f56135f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f56136g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f56137h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f56138i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f56139j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f56140k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f56141l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f56142m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f56143n;

    /* renamed from: o  reason: collision with root package name */
    private final Path f56144o;

    /* renamed from: p  reason: collision with root package name */
    private final PointF f56145p;

    /* renamed from: q  reason: collision with root package name */
    private RectF f56146q;

    /* renamed from: r  reason: collision with root package name */
    private RectF f56147r;

    /* renamed from: s  reason: collision with root package name */
    private List<qf0.b> f56148s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f56149t;

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    public interface a {
        List<qf0.b> a(rs.e eVar);
    }

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void a(DateTime dateTime);
    }

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<Paint> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Paint invoke() {
            return DataPopUpView.e(DataPopUpView.this);
        }
    }

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<Float> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f56151a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.f56151a = context;
        }

        @Override // ym0.a
        public final Float invoke() {
            return Float.valueOf(wq.a.c(8, this.f56151a));
        }
    }

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f56152a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(0);
            this.f56152a = context;
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(wq.a.c(10, this.f56152a));
        }
    }

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<Paint> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Paint invoke() {
            return DataPopUpView.f(DataPopUpView.this);
        }
    }

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    static final class g extends w implements ym0.a<Float> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f56154a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context) {
            super(0);
            this.f56154a = context;
        }

        @Override // ym0.a
        public final Float invoke() {
            return Float.valueOf(wq.a.c(1, this.f56154a));
        }
    }

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    public static final class h implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<rs.e, List<qf0.b>> f56155a;

        /* JADX WARN: Multi-variable type inference failed */
        h(l<? super rs.e, ? extends List<qf0.b>> lVar) {
            this.f56155a = lVar;
        }

        @Override // com.withings.wiscale2.graph.DataPopUpView.a
        public final List<qf0.b> a(rs.e eVar) {
            return this.f56155a.invoke(eVar);
        }
    }

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    static final class i extends w implements ym0.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f56156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context context) {
            super(0);
            this.f56156a = context;
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(wq.a.c(8, this.f56156a));
        }
    }

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    static final class j extends w implements ym0.a<TextPaint> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f56157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context) {
            super(0);
            this.f56157a = context;
        }

        @Override // ym0.a
        public final TextPaint invoke() {
            TextPaint k11 = wq.a.k(C1987R.style.detail1, this.f56157a, 14);
            k11.setAntiAlias(true);
            return k11;
        }
    }

    /* compiled from: DataPopUpView.kt */
    /* loaded from: classes5.dex */
    static final class k extends w implements ym0.a<TextPaint> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f56158a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context) {
            super(0);
            this.f56158a = context;
        }

        @Override // ym0.a
        public final TextPaint invoke() {
            TextPaint k11 = wq.a.k(C1987R.style.data7, this.f56158a, 14);
            k11.setAntiAlias(true);
            return k11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataPopUpView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    public static boolean d(DataPopUpView this$0, rs.e datum, MotionEvent motionEvent) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(datum, "$datum");
        if (motionEvent.getAction() == 0) {
            RectF rectF = this$0.f56147r;
            if (rectF != null) {
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    b bVar = this$0.f56130a;
                    if (bVar != null) {
                        Object obj = datum.f95625j;
                        kotlin.jvm.internal.u.h(obj, "null cannot be cast to non-null type org.joda.time.DateTime");
                        bVar.a((DateTime) obj);
                    }
                    return true;
                }
            } else {
                kotlin.jvm.internal.u.s("popUpRect");
                throw null;
            }
        }
        return false;
    }

    public static final Paint e(DataPopUpView dataPopUpView) {
        dataPopUpView.getClass();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        Context context = dataPopUpView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        paint.setColor(u.w(C1987R.attr.colorSurface, context, -65281));
        paint.setAntiAlias(true);
        paint.setShadowLayer(5.0f, 5.0f, 5.0f, f56129u);
        dataPopUpView.setLayerType(1, paint);
        return paint;
    }

    public static final Paint f(DataPopUpView dataPopUpView) {
        dataPopUpView.getClass();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(dataPopUpView.getSeparatorWidth());
        Context context = dataPopUpView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        paint.setColor(u.w(C1987R.attr.colorOnBackground, context, -65281));
        paint.setAntiAlias(true);
        return paint;
    }

    private final float getBackgroundHeight() {
        Object obj;
        Iterator<T> it = this.f56148s.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((qf0.b) obj).b() != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            return getValueTextPaint().getTextSize() + (getTextMargin() * 2);
        }
        return (getTextMargin() * 2) + getValueTextPaint().getTextSize() + getTitleTextPaint().getTextSize();
    }

    private final Paint getBackgroundPaint() {
        return (Paint) this.f56136g.getValue();
    }

    private final float getBackgroundRadius() {
        return ((Number) this.f56141l.getValue()).floatValue();
    }

    private final float getMaxWidth() {
        Object obj;
        Iterator<T> it = this.f56148s.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((qf0.b) obj).b() != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            List<qf0.b> list = this.f56148s;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (qf0.b bVar : list) {
                arrayList.add(Float.valueOf(getValueTextPaint().measureText(bVar.a())));
            }
            Float a02 = x.a0(arrayList);
            if (a02 == null) {
                return 0.0f;
            }
            return a02.floatValue();
        }
        List<qf0.b> list2 = this.f56148s;
        ArrayList arrayList2 = new ArrayList(x.y(list2, 10));
        for (qf0.b bVar2 : list2) {
            arrayList2.add(Float.valueOf(Math.max(getValueTextPaint().measureText(bVar2.a()), getTitleTextPaint().measureText(bVar2.b()))));
        }
        Float a03 = x.a0(arrayList2);
        if (a03 == null) {
            return 0.0f;
        }
        return a03.floatValue();
    }

    private final int getPointerSize() {
        return ((Number) this.f56142m.getValue()).intValue();
    }

    private final Paint getSeparatorPaint() {
        return (Paint) this.f56137h.getValue();
    }

    private final float getSeparatorWidth() {
        return ((Number) this.f56143n.getValue()).floatValue();
    }

    private final int getTextMargin() {
        return ((Number) this.f56140k.getValue()).intValue();
    }

    private final TextPaint getTitleTextPaint() {
        return (TextPaint) this.f56138i.getValue();
    }

    private final TextPaint getValueTextPaint() {
        return (TextPaint) this.f56139j.getValue();
    }

    @Override // ys.g
    public final void a() {
        setVisibility(8);
    }

    @Override // ys.g
    @SuppressLint({"ClickableViewAccessibility"})
    public final void b(GraphView graphView, List<? extends rs.e> datums, PointF pointF) {
        boolean z5;
        boolean z11;
        float f11;
        boolean z12;
        List<qf0.b> a11;
        kotlin.jvm.internal.u.j(graphView, "graphView");
        kotlin.jvm.internal.u.j(datums, "datums");
        final rs.e eVar = (rs.e) x.K(datums);
        if (eVar == null) {
            return;
        }
        a aVar = this.f56131b;
        if (aVar != null && (a11 = aVar.a(eVar)) != null) {
            this.f56148s = a11;
        }
        int i11 = this.f56135f;
        PointF pointF2 = this.f56145p;
        boolean z13 = true;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                pointF2.set(eVar.f95616a, eVar.f95617b);
                pointF2.set(graphView.q(pointF2.x), graphView.r(pointF2.y));
            }
        } else if (pointF != null) {
            pointF2.set(pointF);
        }
        RectF rectF = new RectF(graphView.getContentRect());
        this.f56146q = rectF;
        float textMargin = ((getTextMargin() * 2) + getMaxWidth()) * this.f56148s.size();
        float backgroundHeight = getBackgroundHeight();
        if (pointF2.y + getPointerSize() + backgroundHeight < rectF.bottom) {
            z5 = true;
        } else {
            z5 = false;
        }
        float f12 = rectF.top;
        if ((pointF2.y - getPointerSize()) - backgroundHeight > f12) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = this.f56135f;
        if (i12 == 2) {
            this.f56149t = true;
        } else if (i12 == 3) {
            this.f56149t = false;
            f12 = (rectF.bottom - backgroundHeight) - getPointerSize();
        } else {
            if (z11) {
                this.f56149t = true;
                f11 = pointF2.y - getPointerSize();
            } else if (z5) {
                this.f56149t = false;
                f12 = pointF2.y + getPointerSize();
            } else {
                this.f56149t = true;
                f11 = pointF2.y;
            }
            f12 = f11 - backgroundHeight;
        }
        float f13 = pointF2.x;
        float f14 = textMargin / 2;
        float f15 = f13 - f14;
        float f16 = rectF.left;
        if (f15 > f16) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f17 = rectF.right;
        if (f13 + f14 >= f17) {
            z13 = false;
        }
        if (!z12 || !z13) {
            if (z13) {
                f15 = f16;
            } else if (z12) {
                f15 = f17 - textMargin;
            }
        }
        this.f56147r = new RectF(f15, f12, textMargin + f15, backgroundHeight + f12);
        setVisibility(0);
        setOnTouchListener(new View.OnTouchListener() { // from class: qf0.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DataPopUpView.d(DataPopUpView.this, eVar, motionEvent);
            }
        });
        invalidate();
    }

    public final int getBottomPadding() {
        return this.f56134e;
    }

    public final a getContentProvider() {
        return this.f56131b;
    }

    public final b getOnPopupClickListener() {
        return this.f56130a;
    }

    public final int getPositionMode() {
        return this.f56135f;
    }

    public final boolean getShouldLineMatchContentRectBottom() {
        return this.f56133d;
    }

    public final boolean getShouldShowLine() {
        return this.f56132c;
    }

    @Override // ys.g
    public final boolean isVisible() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f11;
        float pointerSize;
        Float f12;
        float backgroundRadius;
        Float f13;
        float backgroundRadius2;
        Float f14;
        float backgroundRadius3;
        Float f15;
        float backgroundRadius4;
        Float f16;
        float backgroundRadius5;
        Float f17;
        float backgroundRadius6;
        Float f18;
        float backgroundRadius7;
        float backgroundRadius8;
        float f19;
        float bottom;
        kotlin.jvm.internal.u.j(canvas, "canvas");
        boolean z5 = this.f56132c;
        PointF pointF = this.f56145p;
        if (z5) {
            RectF rectF = this.f56146q;
            if (rectF != null) {
                if (this.f56133d) {
                    bottom = rectF.bottom;
                } else {
                    bottom = getBottom() - this.f56134e;
                }
                float f21 = bottom;
                float f22 = pointF.x;
                canvas.drawLine(f22, rectF.top, f22, f21, getSeparatorPaint());
            } else {
                kotlin.jvm.internal.u.s("graphViewRect");
                throw null;
            }
        }
        RectF rectF2 = this.f56147r;
        if (rectF2 != null) {
            boolean z11 = this.f56149t;
            if (z11) {
                f11 = rectF2.bottom;
            } else {
                f11 = rectF2.top;
            }
            if (z11) {
                pointerSize = getPointerSize() + f11;
            } else {
                pointerSize = f11 - getPointerSize();
            }
            Path path = this.f56144o;
            path.rewind();
            float[] fArr = new float[8];
            Float valueOf = Float.valueOf(0.0f);
            if (!this.f56149t && pointF.x - getPointerSize() < rectF2.left + getBackgroundRadius()) {
                f12 = valueOf;
            } else {
                f12 = null;
            }
            if (f12 != null) {
                backgroundRadius = f12.floatValue();
            } else {
                backgroundRadius = getBackgroundRadius();
            }
            int i11 = 0;
            fArr[0] = backgroundRadius;
            if (!this.f56149t && pointF.x - getPointerSize() < rectF2.left + getBackgroundRadius()) {
                f13 = valueOf;
            } else {
                f13 = null;
            }
            if (f13 != null) {
                backgroundRadius2 = f13.floatValue();
            } else {
                backgroundRadius2 = getBackgroundRadius();
            }
            fArr[1] = backgroundRadius2;
            if (!this.f56149t && pointF.x + getPointerSize() > rectF2.right - getBackgroundRadius()) {
                f14 = valueOf;
            } else {
                f14 = null;
            }
            if (f14 != null) {
                backgroundRadius3 = f14.floatValue();
            } else {
                backgroundRadius3 = getBackgroundRadius();
            }
            fArr[2] = backgroundRadius3;
            if (!this.f56149t && pointF.x + getPointerSize() > rectF2.right - getBackgroundRadius()) {
                f15 = valueOf;
            } else {
                f15 = null;
            }
            if (f15 != null) {
                backgroundRadius4 = f15.floatValue();
            } else {
                backgroundRadius4 = getBackgroundRadius();
            }
            fArr[3] = backgroundRadius4;
            if (this.f56149t && pointF.x + getPointerSize() > rectF2.right - getBackgroundRadius()) {
                f16 = valueOf;
            } else {
                f16 = null;
            }
            if (f16 != null) {
                backgroundRadius5 = f16.floatValue();
            } else {
                backgroundRadius5 = getBackgroundRadius();
            }
            fArr[4] = backgroundRadius5;
            if (this.f56149t && pointF.x + getPointerSize() > rectF2.right - getBackgroundRadius()) {
                f17 = valueOf;
            } else {
                f17 = null;
            }
            if (f17 != null) {
                backgroundRadius6 = f17.floatValue();
            } else {
                backgroundRadius6 = getBackgroundRadius();
            }
            fArr[5] = backgroundRadius6;
            if (this.f56149t && pointF.x - getPointerSize() < rectF2.left + getBackgroundRadius()) {
                f18 = valueOf;
            } else {
                f18 = null;
            }
            if (f18 != null) {
                backgroundRadius7 = f18.floatValue();
            } else {
                backgroundRadius7 = getBackgroundRadius();
            }
            fArr[6] = backgroundRadius7;
            valueOf = (!this.f56149t || pointF.x - getPointerSize() >= rectF2.left + getBackgroundRadius()) ? null : null;
            if (valueOf != null) {
                backgroundRadius8 = valueOf.floatValue();
            } else {
                backgroundRadius8 = getBackgroundRadius();
            }
            fArr[7] = backgroundRadius8;
            path.addRoundRect(rectF2, fArr, Path.Direction.CCW);
            float max = Math.max(rectF2.left, pointF.x - getPointerSize());
            float min = Math.min(rectF2.right, pointF.x + getPointerSize());
            path.moveTo(max, f11);
            path.lineTo(min, f11);
            path.lineTo(pointF.x, pointerSize);
            path.lineTo(max, f11);
            canvas.drawPath(path, getBackgroundPaint());
            RectF rectF3 = this.f56147r;
            if (rectF3 != null) {
                float width = rectF3.width() / this.f56148s.size();
                for (Object obj : this.f56148s) {
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        qf0.b bVar = (qf0.b) obj;
                        float f23 = 2;
                        float f24 = (i11 * width) + (width / f23) + rectF3.left;
                        canvas.drawText(bVar.a(), f24 - (getValueTextPaint().measureText(bVar.a()) / f23), getValueTextPaint().getTextSize() + rectF3.top + getTextMargin(), getValueTextPaint());
                        String b10 = bVar.b();
                        if (b10 != null) {
                            f19 = getTitleTextPaint().measureText(b10);
                        } else {
                            f19 = 0.0f;
                        }
                        String b11 = bVar.b();
                        if (b11 == null) {
                            b11 = "";
                        }
                        canvas.drawText(b11, f24 - (f19 / f23), rectF3.bottom - getTextMargin(), getTitleTextPaint());
                        if (i11 != x.M(this.f56148s)) {
                            float f25 = (i12 * width) + rectF3.left;
                            canvas.drawLine(f25, rectF3.top + getTextMargin(), f25, rectF3.bottom - getTextMargin(), getSeparatorPaint());
                        }
                        i11 = i12;
                    } else {
                        x.K0();
                        throw null;
                    }
                }
                return;
            }
            kotlin.jvm.internal.u.s("popUpRect");
            throw null;
        }
        kotlin.jvm.internal.u.s("popUpRect");
        throw null;
    }

    public final void setBottomPadding(int i11) {
        this.f56134e = i11;
    }

    public final void setContentProvider(l<? super rs.e, ? extends List<qf0.b>> contentProvider) {
        kotlin.jvm.internal.u.j(contentProvider, "contentProvider");
        this.f56131b = new h(contentProvider);
    }

    public final void setOnPopupClickListener(b bVar) {
        this.f56130a = bVar;
    }

    public final void setPositionMode(int i11) {
        if (i11 != 0 && i11 != 1 && i11 != 2 && i11 != 3) {
            throw new IllegalArgumentException(o0.a("positionMode ", this.f56135f, " does not exist"));
        }
        this.f56135f = i11;
    }

    public final void setShouldLineMatchContentRectBottom(boolean z5) {
        this.f56133d = z5;
    }

    public final void setShouldShowLine(boolean z5) {
        this.f56132c = z5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataPopUpView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        this.f56133d = true;
        this.f56136g = nm0.h.b(new c());
        this.f56137h = nm0.h.b(new f());
        this.f56138i = nm0.h.b(new j(context));
        this.f56139j = nm0.h.b(new k(context));
        this.f56140k = nm0.h.b(new i(context));
        this.f56141l = nm0.h.b(new d(context));
        this.f56142m = nm0.h.b(new e(context));
        this.f56143n = nm0.h.b(new g(context));
        this.f56144o = new Path();
        this.f56145p = new PointF();
        this.f56148s = i0.f76187a;
        this.f56149t = true;
        setVisibility(8);
    }

    public final void setContentProvider(a aVar) {
        this.f56131b = aVar;
    }
}
