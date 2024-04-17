package com.withings.views.view;

import android.animation.ObjectAnimator;
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
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
@Deprecated
/* loaded from: classes4.dex */
public class CircleProgressView extends View {

    /* renamed from: a  reason: collision with root package name */
    private int[] f46505a;

    /* renamed from: b  reason: collision with root package name */
    private int f46506b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f46507c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f46508d;

    /* renamed from: e  reason: collision with root package name */
    private float f46509e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f46510f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f46511g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f46512h;

    /* renamed from: i  reason: collision with root package name */
    private int f46513i;

    /* renamed from: j  reason: collision with root package name */
    private float f46514j;

    /* renamed from: k  reason: collision with root package name */
    private float f46515k;

    /* renamed from: l  reason: collision with root package name */
    private RectF f46516l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f46517m;

    /* renamed from: n  reason: collision with root package name */
    private int f46518n;

    /* renamed from: o  reason: collision with root package name */
    private String f46519o;

    /* renamed from: p  reason: collision with root package name */
    private String f46520p;

    /* renamed from: q  reason: collision with root package name */
    private float f46521q;

    /* renamed from: r  reason: collision with root package name */
    private UseCase f46522r;

    /* renamed from: s  reason: collision with root package name */
    protected float f46523s;

    /* renamed from: t  reason: collision with root package name */
    private float f46524t;

    /* renamed from: u  reason: collision with root package name */
    private float f46525u;

    /* renamed from: v  reason: collision with root package name */
    private int f46526v;

    /* renamed from: w  reason: collision with root package name */
    private int f46527w;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class UseCase {

        /* renamed from: a  reason: collision with root package name */
        public static final UseCase f46528a;

        /* renamed from: b  reason: collision with root package name */
        private static final /* synthetic */ UseCase[] f46529b;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.views.view.CircleProgressView$UseCase] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.views.view.CircleProgressView$UseCase] */
        static {
            ?? r02 = new Enum("WEEK", 0);
            f46528a = r02;
            f46529b = new UseCase[]{r02, new Enum("OTHERS", 1)};
        }

        private UseCase() {
            throw null;
        }

        public static UseCase valueOf(String str) {
            return (UseCase) Enum.valueOf(UseCase.class, str);
        }

        public static UseCase[] values() {
            return (UseCase[]) f46529b.clone();
        }
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getExternalCircleBackgroundColor() {
        int i11 = (int) this.f46523s;
        int[] iArr = this.f46505a;
        if (i11 >= iArr.length - 1) {
            return iArr[iArr.length - 2];
        }
        return iArr[i11];
    }

    private int getExternalCircleFillColor() {
        int i11 = (int) this.f46523s;
        int[] iArr = this.f46505a;
        if (i11 >= iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        return iArr[i11 + 1];
    }

    private void setAnimatedProgress(float f11) {
        float f12 = f11 / this.f46524t;
        this.f46523s = f12;
        if (this.f46522r == UseCase.f46528a) {
            setTextMiddle(String.valueOf((int) f11));
        } else {
            setTextMiddle(String.valueOf((int) (f12 * 100.0f)));
        }
        invalidate();
    }

    public final void a(float f11, int i11) {
        ObjectAnimator a11 = new i80.a(this, i11, Float.valueOf(this.f46525u), Float.valueOf(f11)).a();
        a11.setInterpolator(new DecelerateInterpolator());
        a11.start();
        this.f46525u = f11;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f11;
        float f12;
        super.onDraw(canvas);
        if (isInEditMode()) {
            this.f46519o = "137";
        }
        float paddingLeft = (getPaddingLeft() + (canvas.getWidth() / 2)) - getPaddingRight();
        float paddingTop = (getPaddingTop() + (canvas.getHeight() / 2)) - getPaddingBottom();
        int i11 = this.f46518n;
        if (i11 != 0) {
            this.f46508d.setColor(i11);
            canvas.drawCircle(paddingLeft, paddingTop, getWidth() / 2, this.f46508d);
        }
        if (this.f46517m) {
            if (paddingLeft < paddingTop) {
                f11 = paddingLeft;
            } else {
                f11 = paddingTop;
            }
            this.f46507c.setStyle(Paint.Style.STROKE);
            this.f46507c.setStrokeCap(Paint.Cap.ROUND);
            float f13 = this.f46509e;
            float f14 = f13 / 2.0f;
            float f15 = f11 - f14;
            Paint paint = this.f46507c;
            if (!this.f46510f) {
                f13 = f14;
            }
            paint.setStrokeWidth(f13);
            this.f46507c.setColor(getExternalCircleBackgroundColor());
            canvas.drawCircle(paddingLeft, paddingTop, f15, this.f46507c);
            this.f46507c.setColor(getExternalCircleFillColor());
            this.f46507c.setStrokeWidth(this.f46509e);
            RectF rectF = this.f46516l;
            rectF.left = paddingLeft - f15;
            rectF.top = paddingTop - f15;
            rectF.right = paddingLeft + f15;
            rectF.bottom = f15 + paddingTop;
            canvas.drawArc(rectF, -90.0f, (this.f46523s - ((int) f12)) * 360.0f, false, this.f46507c);
            this.f46507c.setStyle(Paint.Style.FILL);
            this.f46507c.setColor(this.f46506b);
        }
        if (!TextUtils.isEmpty(this.f46519o) && this.f46512h) {
            if (this.f46526v != -1) {
                TextView textView = new TextView(getContext());
                textView.setTextAppearance(this.f46526v);
                this.f46511g.setColor(textView.getCurrentTextColor());
                this.f46511g.setTextSize(textView.getTextSize());
                this.f46511g.setTypeface(textView.getTypeface());
            } else {
                this.f46511g.setColor(this.f46513i);
                this.f46511g.setTextSize(this.f46514j);
            }
            if (this.f46520p != null) {
                paddingTop -= ah.g.k((int) this.f46521q, getContext());
            }
            CanvasHelper.a(canvas, paddingLeft, paddingTop, this.f46519o, this.f46511g);
        }
        if (!TextUtils.isEmpty(this.f46520p)) {
            if (this.f46527w != -1) {
                TextView textView2 = new TextView(getContext());
                textView2.setTextAppearance(this.f46527w);
                this.f46511g.setColor(textView2.getCurrentTextColor());
                this.f46511g.setTextSize(textView2.getTextSize());
                this.f46511g.setTypeface(textView2.getTypeface());
            } else {
                String str = this.f46520p;
                Rect rect = new Rect();
                this.f46511g.setTextSize(this.f46515k);
                this.f46511g.getTextBounds(str, 0, str.length(), rect);
                int width = getWidth() / 2;
                while (rect.width() > width) {
                    Paint paint2 = this.f46511g;
                    paint2.setTextSize(paint2.getTextSize() - 1.0f);
                    this.f46511g.getTextBounds(str, 0, str.length(), rect);
                }
            }
            if (!isInEditMode()) {
                this.f46511g.setTypeface(Typeface.createFromAsset(getContext().getAssets(), getContext().getString(C1987R.string.font_roboto_regular)));
            }
            CanvasHelper.a(canvas, paddingLeft, (getHeight() / 9.0f) + (getHeight() * 0.6666667f), this.f46520p, this.f46511g);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size);
    }

    public void setBigTextSize(int i11) {
        this.f46514j = ah.g.y(i11, getContext());
        invalidate();
    }

    public void setBottomTextStyle(int i11) {
        this.f46527w = i11;
    }

    public void setCircleFillColor(int i11) {
        this.f46518n = i11;
        invalidate();
    }

    public void setCircleInternalColor(int i11) {
        this.f46506b = i11;
        invalidate();
    }

    public void setCircleProgressColors(int[] iArr) {
        if (iArr.length > 0) {
            this.f46505a = iArr;
            invalidate();
        }
    }

    public void setCircleTextColor(int i11) {
        this.f46513i = i11;
        invalidate();
    }

    public void setFillColor(int i11) {
        this.f46518n = i11;
        invalidate();
    }

    public void setGoal(float f11) {
        this.f46524t = f11;
    }

    public void setMiddleTextStyle(int i11) {
        this.f46526v = i11;
    }

    public void setProgress(float f11) {
        this.f46525u = f11;
        setAnimatedProgress(f11);
    }

    public void setProgressEnabled(boolean z5) {
        this.f46517m = z5;
        invalidate();
    }

    public void setStrokeSize(float f11) {
        this.f46509e = f11;
        invalidate();
    }

    public void setTextBottom(String str) {
        this.f46520p = str;
        invalidate();
    }

    public void setTextMiddle(String str) {
        this.f46519o = str;
        invalidate();
    }

    public void setTextSeparatorSize(float f11) {
        this.f46521q = f11;
    }

    public CircleProgressView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f46510f = true;
        this.f46513i = -16777216;
        this.f46514j = ah.g.k(18, getContext());
        this.f46516l = new RectF();
        this.f46517m = true;
        this.f46518n = 0;
        this.f46524t = 10000.0f;
        this.f46526v = -1;
        this.f46527w = -1;
        if (isInEditMode()) {
            this.f46509e = 6.0f;
            this.f46514j = 44.0f;
            this.f46515k = 20.0f;
            this.f46525u = 4.0f;
            this.f46523s = 0.4f;
            this.f46524t = 10.0f;
            this.f46522r = UseCase.f46528a;
        } else {
            this.f46509e = ah.g.k(2, getContext());
            this.f46514j = ah.g.k(18, getContext());
            this.f46515k = ah.g.k(10, getContext());
        }
        Paint paint = new Paint();
        this.f46507c = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f46511g = paint2;
        paint2.setTextAlign(Paint.Align.CENTER);
        this.f46511g.setAntiAlias(true);
        setDrawingCacheEnabled(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22408d);
            this.f46518n = obtainStyledAttributes.getColor(1, 0);
            this.f46513i = obtainStyledAttributes.getColor(5, this.f46513i);
            this.f46512h = obtainStyledAttributes.getBoolean(7, true);
            this.f46509e = obtainStyledAttributes.getDimension(10, ah.g.k(2, getContext()));
            if (isInEditMode()) {
                this.f46505a = new int[]{-7829368, -16776961};
                this.f46511g.setColor(-1);
            } else {
                this.f46526v = obtainStyledAttributes.getResourceId(3, -1);
                this.f46527w = obtainStyledAttributes.getResourceId(0, -1);
                int resourceId = obtainStyledAttributes.getResourceId(4, -1);
                if (resourceId != -1) {
                    this.f46505a = getResources().getIntArray(resourceId);
                }
                this.f46506b = obtainStyledAttributes.getColor(2, -16777216);
                if (obtainStyledAttributes.hasValue(9)) {
                    this.f46514j = obtainStyledAttributes.getDimensionPixelSize(9, (int) this.f46514j);
                }
                if (obtainStyledAttributes.hasValue(8)) {
                    this.f46521q = obtainStyledAttributes.getDimension(8, 2.0f);
                }
                obtainStyledAttributes.recycle();
            }
        }
        Paint paint3 = new Paint();
        this.f46508d = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f46508d.setColor(this.f46518n);
        this.f46508d.setAntiAlias(true);
    }
}
