package com.withings.wiscale2.measure.heartrate;

import ah.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class HeartRateGraphView extends View {

    /* renamed from: a  reason: collision with root package name */
    Paint f58438a;

    /* renamed from: b  reason: collision with root package name */
    Paint f58439b;

    /* renamed from: c  reason: collision with root package name */
    Path f58440c;

    /* renamed from: d  reason: collision with root package name */
    private double[] f58441d;

    /* renamed from: e  reason: collision with root package name */
    private double[] f58442e;

    /* renamed from: f  reason: collision with root package name */
    private int f58443f;

    /* renamed from: g  reason: collision with root package name */
    private int f58444g;

    /* renamed from: h  reason: collision with root package name */
    private double f58445h;

    /* renamed from: i  reason: collision with root package name */
    private double[] f58446i;

    /* renamed from: j  reason: collision with root package name */
    private double[] f58447j;

    /* renamed from: k  reason: collision with root package name */
    private HeartRateHandler f58448k;

    /* renamed from: l  reason: collision with root package name */
    private final ScheduledExecutorService f58449l;

    /* renamed from: m  reason: collision with root package name */
    private ScheduledFuture f58450m;

    /* loaded from: classes5.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            HeartRateGraphView.a(HeartRateGraphView.this);
        }
    }

    public HeartRateGraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58438a = new Paint();
        this.f58439b = new Paint();
        this.f58440c = new Path();
        this.f58449l = Executors.newScheduledThreadPool(1);
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000b, B:12:0x0021, B:14:0x0034, B:24:0x0067, B:26:0x007a, B:27:0x007c, B:31:0x00b7, B:19:0x0042, B:21:0x0052, B:23:0x005f, B:30:0x009d), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(com.withings.wiscale2.measure.heartrate.HeartRateGraphView r13) {
        /*
            monitor-enter(r13)
            double[] r0 = r13.f58446i     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto Lc8
            double[] r1 = r13.f58447j     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto Lb
            goto Lc8
        Lb:
            int r2 = r13.f58444g     // Catch: java.lang.Throwable -> L3f
            com.withings.wiscale2.measure.heartrate.HeartRateHandler r3 = r13.f58448k     // Catch: java.lang.Throwable -> L3f
            int r4 = r3.f58459h     // Catch: java.lang.Throwable -> L3f
            if (r2 >= r4) goto Lc6
            r2 = 120(0x78, float:1.68E-43)
            r5 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            r7 = 4609884578576439706(0x3ff999999999999a, double:1.6)
            if (r4 <= r2) goto L99
            int r0 = r4 + (-60)
            double[] r1 = r3.f58463l     // Catch: java.lang.Throwable -> L3f
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L3f
            double r9 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L3f
            r11 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 < 0) goto L42
            double r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L3f
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L67
            goto L42
        L3f:
            r0 = move-exception
            goto Lca
        L42:
            int r0 = r4 + (-59)
            com.withings.wiscale2.measure.heartrate.HeartRateHandler r1 = r13.f58448k     // Catch: java.lang.Throwable -> L3f
            double[] r1 = r1.f58463l     // Catch: java.lang.Throwable -> L3f
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L3f
            double r9 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L3f
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 < 0) goto L5f
            double r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L3f
            r9 = 4607173411600762667(0x3feff7ced916872b, double:0.999)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 <= 0) goto L67
        L5f:
            int r0 = r4 + (-61)
            com.withings.wiscale2.measure.heartrate.HeartRateHandler r1 = r13.f58448k     // Catch: java.lang.Throwable -> L3f
            double[] r1 = r1.f58463l     // Catch: java.lang.Throwable -> L3f
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L3f
        L67:
            com.withings.wiscale2.measure.heartrate.HeartRateHandler r1 = r13.f58448k     // Catch: java.lang.Throwable -> L3f
            double[] r1 = r1.f58463l     // Catch: java.lang.Throwable -> L3f
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L3f
            double r3 = r13.f58445h     // Catch: java.lang.Throwable -> L3f
            double r3 = r3 - r1
            double r3 = java.lang.Math.abs(r3)     // Catch: java.lang.Throwable -> L3f
            r9 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L7c
            double r1 = r13.f58445h     // Catch: java.lang.Throwable -> L3f
        L7c:
            double[] r3 = r13.f58446i     // Catch: java.lang.Throwable -> L3f
            int r4 = r13.f58443f     // Catch: java.lang.Throwable -> L3f
            double r7 = r7 * r1
            double r7 = r7 - r5
            r3[r4] = r7     // Catch: java.lang.Throwable -> L3f
            double[] r3 = r13.f58447j     // Catch: java.lang.Throwable -> L3f
            com.withings.wiscale2.measure.heartrate.HeartRateHandler r5 = r13.f58448k     // Catch: java.lang.Throwable -> L3f
            double[] r6 = r5.f58465n     // Catch: java.lang.Throwable -> L3f
            r6 = r6[r0]     // Catch: java.lang.Throwable -> L3f
            r3[r4] = r6     // Catch: java.lang.Throwable -> L3f
            r13.f58445h = r1     // Catch: java.lang.Throwable -> L3f
            int r4 = r4 + 1
            r13.f58443f = r4     // Catch: java.lang.Throwable -> L3f
            int r0 = r5.f58459h     // Catch: java.lang.Throwable -> L3f
            r13.f58444g = r0     // Catch: java.lang.Throwable -> L3f
            goto Lb7
        L99:
            r2 = 60
            if (r4 <= r2) goto Lb7
            int r2 = r13.f58443f     // Catch: java.lang.Throwable -> L3f
            double[] r9 = r3.f58463l     // Catch: java.lang.Throwable -> L3f
            r9 = r9[r2]     // Catch: java.lang.Throwable -> L3f
            double r9 = r9 * r7
            double r9 = r9 - r5
            r0[r2] = r9     // Catch: java.lang.Throwable -> L3f
            r5 = 0
            r13.f58445h = r5     // Catch: java.lang.Throwable -> L3f
            double[] r0 = r3.f58465n     // Catch: java.lang.Throwable -> L3f
            r5 = r0[r2]     // Catch: java.lang.Throwable -> L3f
            r1[r2] = r5     // Catch: java.lang.Throwable -> L3f
            int r2 = r2 + 1
            r13.f58443f = r2     // Catch: java.lang.Throwable -> L3f
            r13.f58444g = r4     // Catch: java.lang.Throwable -> L3f
        Lb7:
            double[] r0 = r13.f58447j     // Catch: java.lang.Throwable -> L3f
            double[] r1 = r13.f58446i     // Catch: java.lang.Throwable -> L3f
            int r2 = r13.f58443f     // Catch: java.lang.Throwable -> L3f
            r13.f58441d = r0     // Catch: java.lang.Throwable -> L3f
            r13.f58442e = r1     // Catch: java.lang.Throwable -> L3f
            r13.f58443f = r2     // Catch: java.lang.Throwable -> L3f
            r13.postInvalidate()     // Catch: java.lang.Throwable -> L3f
        Lc6:
            monitor-exit(r13)
            goto Lc9
        Lc8:
            monitor-exit(r13)
        Lc9:
            return
        Lca:
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.measure.heartrate.HeartRateGraphView.a(com.withings.wiscale2.measure.heartrate.HeartRateGraphView):void");
    }

    private void b() {
        setWillNotDraw(false);
        setLayerType(1, null);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f58438a;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        Paint paint2 = this.f58439b;
        paint2.setStyle(style);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setPathEffect(new CornerPathEffect(10.0f));
        paint2.setStrokeWidth(g.k(2, getContext()));
    }

    public final synchronized void c() {
        e();
        this.f58443f = 0;
        postInvalidate();
    }

    public final void d(HeartRateHandler heartRateHandler) {
        this.f58448k = heartRateHandler;
        int i11 = heartRateHandler.f58459h;
        this.f58444g = 0;
        this.f58445h = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f58446i = new double[1200];
        this.f58447j = new double[1200];
        this.f58443f = 0;
        postInvalidate();
        e();
        this.f58450m = this.f58449l.scheduleAtFixedRate(new a(), 0L, 30L, TimeUnit.MILLISECONDS);
    }

    public final synchronized void e() {
        ScheduledFuture scheduledFuture = this.f58450m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f58450m = null;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        double d11;
        super.onDraw(canvas);
        double height = getHeight() / 2;
        double width = getWidth();
        float f11 = (float) height;
        canvas.drawLine(0.0f, f11, (float) width, f11, this.f58438a);
        int i11 = this.f58443f;
        if (i11 > 1) {
            double d12 = this.f58441d[i11 - 1];
            double d13 = width / 3.0d;
            PointF pointF = new PointF((float) (width - ((d12 - this.f58441d[1]) * d13)), (float) (height - (this.f58442e[1] * height)));
            Path path = this.f58440c;
            path.reset();
            path.moveTo(pointF.x, pointF.y);
            PointF pointF2 = new PointF(0.0f, 0.0f);
            int i12 = 3;
            while (i12 < this.f58443f) {
                if (!Double.isNaN(this.f58441d[i12]) && !Double.isNaN(this.f58442e[i12])) {
                    double[] dArr = this.f58441d;
                    if (dArr[i12] - dArr[i12 - 1] > 0.02d) {
                        double[] dArr2 = this.f58442e;
                        double d14 = dArr2[i12];
                        if (d14 < -1.0d) {
                            d14 = -1.0d;
                        }
                        dArr2[i12] = d14;
                        if (d14 > 1.0d) {
                            d14 = 1.0d;
                        }
                        dArr2[i12] = d14;
                        pointF2 = new PointF((float) (width - ((d12 - this.f58441d[i12]) * d13)), (float) (height - (this.f58442e[i12] * height)));
                        if (pointF2.x >= pointF.x) {
                            d11 = height;
                            PointF pointF3 = new PointF((float) ((pointF2.x + pointF.x) * 0.5d), (float) ((pointF2.y + pointF.y) * 0.5d));
                            path.quadTo(pointF.x, pointF.y, pointF3.x, pointF3.y);
                            pointF = pointF2;
                            i12++;
                            height = d11;
                        }
                    }
                }
                d11 = height;
                i12++;
                height = d11;
            }
            path.moveTo(pointF2.x, pointF2.y);
            canvas.drawPath(path, this.f58439b);
        }
    }

    public HeartRateGraphView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f58438a = new Paint();
        this.f58439b = new Paint();
        this.f58440c = new Path();
        this.f58449l = Executors.newScheduledThreadPool(1);
        b();
    }
}
