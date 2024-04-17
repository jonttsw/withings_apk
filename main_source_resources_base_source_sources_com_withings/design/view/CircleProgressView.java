package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.withings.design.util.CanvasHelper;
import com.withings.wiscale2.C1987R;
/* loaded from: classes3.dex */
public class CircleProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int[] f36173a;

    /* renamed from: b  reason: collision with root package name */
    private int f36174b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f36175c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f36176d;

    /* renamed from: e  reason: collision with root package name */
    private float f36177e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36178f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f36179g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f36180h;

    /* renamed from: i  reason: collision with root package name */
    private int f36181i;

    /* renamed from: j  reason: collision with root package name */
    private float f36182j;

    /* renamed from: k  reason: collision with root package name */
    private float f36183k;

    /* renamed from: l  reason: collision with root package name */
    private RectF f36184l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f36185m;

    /* renamed from: n  reason: collision with root package name */
    private int f36186n;

    /* renamed from: o  reason: collision with root package name */
    private String f36187o;

    /* renamed from: p  reason: collision with root package name */
    private String f36188p;

    /* renamed from: q  reason: collision with root package name */
    private float f36189q;

    /* renamed from: r  reason: collision with root package name */
    private UseCase f36190r;

    /* renamed from: s  reason: collision with root package name */
    protected float f36191s;

    /* renamed from: t  reason: collision with root package name */
    private float f36192t;

    /* renamed from: u  reason: collision with root package name */
    private int f36193u;

    /* renamed from: v  reason: collision with root package name */
    private int f36194v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class UseCase {

        /* renamed from: a  reason: collision with root package name */
        public static final UseCase f36195a;

        /* renamed from: b  reason: collision with root package name */
        private static final /* synthetic */ UseCase[] f36196b;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.design.view.CircleProgressView$UseCase] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.design.view.CircleProgressView$UseCase] */
        static {
            ?? r02 = new Enum("WEEK", 0);
            f36195a = r02;
            f36196b = new UseCase[]{r02, new Enum("OTHERS", 1)};
        }

        private UseCase() {
            throw null;
        }

        public static UseCase valueOf(String str) {
            return (UseCase) Enum.valueOf(UseCase.class, str);
        }

        public static UseCase[] values() {
            return (UseCase[]) f36196b.clone();
        }
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getExternalCircleBackgroundColor() {
        int i11 = (int) this.f36191s;
        int[] iArr = this.f36173a;
        if (i11 >= iArr.length - 1) {
            return iArr[iArr.length - 2];
        }
        return iArr[i11];
    }

    private int getExternalCircleFillColor() {
        int i11 = (int) this.f36191s;
        int[] iArr = this.f36173a;
        if (i11 >= iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        return iArr[i11 + 1];
    }

    private void setAnimatedProgress(float f11) {
        float f12 = f11 / this.f36192t;
        this.f36191s = f12;
        if (this.f36190r == UseCase.f36195a) {
            setTextMiddle(String.valueOf((int) f11));
        } else {
            setTextMiddle(String.valueOf((int) (f12 * 100.0f)));
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f11;
        float f12;
        super.onDraw(canvas);
        if (isInEditMode()) {
            this.f36187o = "137";
        }
        float paddingLeft = (getPaddingLeft() + (canvas.getWidth() / 2)) - getPaddingRight();
        float paddingTop = (getPaddingTop() + (canvas.getHeight() / 2)) - getPaddingBottom();
        int i11 = this.f36186n;
        if (i11 != 0) {
            this.f36176d.setColor(i11);
            canvas.drawCircle(paddingLeft, paddingTop, getWidth() / 2, this.f36176d);
        }
        if (this.f36185m) {
            if (paddingLeft < paddingTop) {
                f11 = paddingLeft;
            } else {
                f11 = paddingTop;
            }
            this.f36175c.setStyle(Paint.Style.STROKE);
            this.f36175c.setStrokeCap(Paint.Cap.ROUND);
            float f13 = this.f36177e;
            float f14 = f13 / 2.0f;
            float f15 = f11 - f14;
            Paint paint = this.f36175c;
            if (!this.f36178f) {
                f13 = f14;
            }
            paint.setStrokeWidth(f13);
            this.f36175c.setColor(getExternalCircleBackgroundColor());
            canvas.drawCircle(paddingLeft, paddingTop, f15, this.f36175c);
            this.f36175c.setColor(getExternalCircleFillColor());
            this.f36175c.setStrokeWidth(this.f36177e);
            RectF rectF = this.f36184l;
            rectF.left = paddingLeft - f15;
            rectF.top = paddingTop - f15;
            rectF.right = paddingLeft + f15;
            rectF.bottom = f15 + paddingTop;
            canvas.drawArc(rectF, -90.0f, (this.f36191s - ((int) f12)) * 360.0f, false, this.f36175c);
            this.f36175c.setStyle(Paint.Style.FILL);
            this.f36175c.setColor(this.f36174b);
        }
        if (!TextUtils.isEmpty(this.f36187o) && this.f36180h) {
            if (this.f36193u != -1) {
                TextView textView = new TextView(getContext());
                textView.setTextAppearance(this.f36193u);
                this.f36179g.setColor(textView.getCurrentTextColor());
                this.f36179g.setTextSize(textView.getTextSize());
                this.f36179g.setTypeface(textView.getTypeface());
            } else {
                this.f36179g.setColor(this.f36181i);
                this.f36179g.setTextSize(this.f36182j);
            }
            if (this.f36188p != null) {
                paddingTop -= ah.g.i((int) this.f36189q, getContext());
            }
            CanvasHelper.a(canvas, paddingLeft, paddingTop, this.f36187o, this.f36179g);
        }
        if (!TextUtils.isEmpty(this.f36188p)) {
            if (this.f36194v != -1) {
                TextView textView2 = new TextView(getContext());
                textView2.setTextAppearance(this.f36194v);
                this.f36179g.setColor(textView2.getCurrentTextColor());
                this.f36179g.setTextSize(textView2.getTextSize());
                this.f36179g.setTypeface(textView2.getTypeface());
            } else {
                String str = this.f36188p;
                Rect rect = new Rect();
                this.f36179g.setTextSize(this.f36183k);
                this.f36179g.getTextBounds(str, 0, str.length(), rect);
                int width = getWidth() / 2;
                while (rect.width() > width) {
                    Paint paint2 = this.f36179g;
                    paint2.setTextSize(paint2.getTextSize() - 1.0f);
                    this.f36179g.getTextBounds(str, 0, str.length(), rect);
                }
            }
            if (!isInEditMode()) {
                this.f36179g.setTypeface(Typeface.createFromAsset(getContext().getAssets(), getContext().getString(C1987R.string.font_roboto_regular)));
            }
            CanvasHelper.a(canvas, paddingLeft, (getHeight() / 9.0f) + (getHeight() * 0.6666667f), this.f36188p, this.f36179g);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size);
    }

    public void setBigTextSize(int i11) {
        this.f36182j = (int) (i11 * getContext().getResources().getDisplayMetrics().scaledDensity);
        invalidate();
    }

    public void setBottomTextStyle(int i11) {
        this.f36194v = i11;
    }

    public void setCircleFillColor(int i11) {
        this.f36186n = i11;
        invalidate();
    }

    public void setCircleInternalColor(int i11) {
        this.f36174b = i11;
        invalidate();
    }

    public void setCircleProgressColors(int[] iArr) {
        if (iArr.length > 0) {
            this.f36173a = iArr;
            invalidate();
        }
    }

    public void setCircleTextColor(int i11) {
        this.f36181i = i11;
        invalidate();
    }

    public void setFillColor(int i11) {
        this.f36186n = i11;
        invalidate();
    }

    public void setGoal(float f11) {
        this.f36192t = f11;
    }

    public void setMiddleTextStyle(int i11) {
        this.f36193u = i11;
    }

    public void setProgress(float f11) {
        setAnimatedProgress(f11);
    }

    public void setProgressEnabled(boolean z5) {
        this.f36185m = z5;
        invalidate();
    }

    public void setStrokeSize(float f11) {
        this.f36177e = f11;
        invalidate();
    }

    public void setTextBottom(String str) {
        this.f36188p = str;
        invalidate();
    }

    public void setTextMiddle(String str) {
        this.f36187o = str;
        invalidate();
    }

    public void setTextSeparatorSize(float f11) {
        this.f36189q = f11;
    }

    public CircleProgressView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36178f = true;
        this.f36181i = -16777216;
        this.f36182j = ah.g.i(18, getContext());
        this.f36184l = new RectF();
        this.f36185m = true;
        this.f36186n = 0;
        this.f36192t = 10000.0f;
        this.f36193u = -1;
        this.f36194v = -1;
        if (isInEditMode()) {
            this.f36177e = 6.0f;
            this.f36182j = 44.0f;
            this.f36183k = 20.0f;
            this.f36191s = 0.4f;
            this.f36192t = 10.0f;
            this.f36190r = UseCase.f36195a;
        } else {
            this.f36177e = ah.g.i(2, getContext());
            this.f36182j = ah.g.i(18, getContext());
            this.f36183k = ah.g.i(10, getContext());
        }
        Paint paint = new Paint();
        this.f36175c = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f36179g = paint2;
        paint2.setTextAlign(Paint.Align.CENTER);
        this.f36179g.setAntiAlias(true);
        setDrawingCacheEnabled(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72601c);
            this.f36186n = obtainStyledAttributes.getColor(1, 0);
            this.f36181i = obtainStyledAttributes.getColor(5, this.f36181i);
            this.f36180h = obtainStyledAttributes.getBoolean(7, true);
            this.f36177e = obtainStyledAttributes.getDimension(10, ah.g.i(2, getContext()));
            if (isInEditMode()) {
                this.f36173a = new int[]{-7829368, -16776961};
                this.f36179g.setColor(-1);
            } else {
                this.f36193u = obtainStyledAttributes.getResourceId(3, -1);
                this.f36194v = obtainStyledAttributes.getResourceId(0, -1);
                int resourceId = obtainStyledAttributes.getResourceId(4, -1);
                if (resourceId != -1) {
                    this.f36173a = getResources().getIntArray(resourceId);
                }
                this.f36174b = obtainStyledAttributes.getColor(2, -16777216);
                if (obtainStyledAttributes.hasValue(9)) {
                    this.f36182j = obtainStyledAttributes.getDimensionPixelSize(9, (int) this.f36182j);
                }
                if (obtainStyledAttributes.hasValue(8)) {
                    this.f36189q = obtainStyledAttributes.getDimension(8, 2.0f);
                }
                obtainStyledAttributes.recycle();
            }
        }
        Paint paint3 = new Paint();
        this.f36176d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f36176d.setColor(this.f36186n);
        this.f36176d.setAntiAlias(true);
    }
}
