package com.withings.wiscale2.measure.heartrate;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class HeartRateHandler implements Camera.PreviewCallback {

    /* renamed from: d  reason: collision with root package name */
    private byte[] f58455d;

    /* renamed from: e  reason: collision with root package name */
    private int f58456e;

    /* renamed from: f  reason: collision with root package name */
    private int f58457f;

    /* renamed from: g  reason: collision with root package name */
    private int f58458g;

    /* renamed from: h  reason: collision with root package name */
    protected int f58459h;

    /* renamed from: i  reason: collision with root package name */
    private long f58460i;

    /* renamed from: j  reason: collision with root package name */
    private double[] f58461j;

    /* renamed from: k  reason: collision with root package name */
    private double[] f58462k;

    /* renamed from: l  reason: collision with root package name */
    protected double[] f58463l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f58464m;

    /* renamed from: n  reason: collision with root package name */
    protected double[] f58465n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f58466o;

    /* renamed from: p  reason: collision with root package name */
    private double f58467p;

    /* renamed from: q  reason: collision with root package name */
    private double f58468q;

    /* renamed from: t  reason: collision with root package name */
    private c f58471t;

    /* renamed from: v  reason: collision with root package name */
    private ScheduledFuture f58473v;

    /* renamed from: w  reason: collision with root package name */
    private ScheduledFuture f58474w;

    /* renamed from: x  reason: collision with root package name */
    private ScheduledFuture f58475x;

    /* renamed from: a  reason: collision with root package name */
    private int f58452a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f58453b = System.currentTimeMillis();

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<byte[]> f58454c = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private int f58469r = 5;

    /* renamed from: s  reason: collision with root package name */
    private HeartrateMeasureState f58470s = HeartrateMeasureState.f58482e;

    /* renamed from: u  reason: collision with root package name */
    private final ScheduledExecutorService f58472u = Executors.newScheduledThreadPool(1);

    /* renamed from: y  reason: collision with root package name */
    private AtomicBoolean f58476y = new AtomicBoolean(false);

    /* renamed from: z  reason: collision with root package name */
    private AtomicBoolean f58477z = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public static final class HeartrateMeasureState {

        /* renamed from: a  reason: collision with root package name */
        public static final HeartrateMeasureState f58478a;

        /* renamed from: b  reason: collision with root package name */
        public static final HeartrateMeasureState f58479b;

        /* renamed from: c  reason: collision with root package name */
        public static final HeartrateMeasureState f58480c;

        /* renamed from: d  reason: collision with root package name */
        public static final HeartrateMeasureState f58481d;

        /* renamed from: e  reason: collision with root package name */
        public static final HeartrateMeasureState f58482e;

        /* renamed from: f  reason: collision with root package name */
        public static final HeartrateMeasureState f58483f;

        /* renamed from: g  reason: collision with root package name */
        private static final /* synthetic */ HeartrateMeasureState[] f58484g;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.measure.heartrate.HeartRateHandler$HeartrateMeasureState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.wiscale2.measure.heartrate.HeartRateHandler$HeartrateMeasureState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.wiscale2.measure.heartrate.HeartRateHandler$HeartrateMeasureState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.wiscale2.measure.heartrate.HeartRateHandler$HeartrateMeasureState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r4v2, types: [com.withings.wiscale2.measure.heartrate.HeartRateHandler$HeartrateMeasureState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r5v2, types: [com.withings.wiscale2.measure.heartrate.HeartRateHandler$HeartrateMeasureState, java.lang.Enum] */
        static {
            ?? r02 = new Enum("HEARTRATE_MEASURE_STATE_INIT", 0);
            f58478a = r02;
            ?? r12 = new Enum("HEARTRATE_MEASURE_STATE_WORKINGPULSE", 1);
            f58479b = r12;
            ?? r22 = new Enum("HEARTRATE_MEASURE_STATE_WORKING", 2);
            f58480c = r22;
            ?? r32 = new Enum("HEARTRATE_MEASURE_STATE_FINISH", 3);
            f58481d = r32;
            ?? r42 = new Enum("HEARTRATE_MEASURE_STATE_NO_FINGER", 4);
            f58482e = r42;
            ?? r52 = new Enum("HEARTRATE_MEASURE_STATE_NO_REINIT", 5);
            f58483f = r52;
            f58484g = new HeartrateMeasureState[]{r02, r12, r22, r32, r42, r52};
        }

        private HeartrateMeasureState() {
            throw null;
        }

        public static HeartrateMeasureState valueOf(String str) {
            return (HeartrateMeasureState) Enum.valueOf(HeartrateMeasureState.class, str);
        }

        public static HeartrateMeasureState[] values() {
            return (HeartrateMeasureState[]) f58484g.clone();
        }
    }

    /* loaded from: classes5.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            HeartRateHandler.c(HeartRateHandler.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            HeartRateHandler.b(HeartRateHandler.this);
        }
    }

    /* loaded from: classes5.dex */
    public interface c {
        void S(HeartrateMeasureState heartrateMeasureState);

        void W0(double d11);

        void j1();

        void n1(double d11);
    }

    public HeartRateHandler(c cVar) {
        this.f58471t = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(HeartRateHandler heartRateHandler) {
        synchronized (heartRateHandler) {
            try {
                if (heartRateHandler.f58476y.get()) {
                    Log.d("HeartRateHandler", "[HR] Final pulse computation");
                    double d11 = heartRateHandler.f58468q;
                    if (d11 < heartRateHandler.f58469r) {
                        Log.d("HeartRateHandler", "__HEARTRATE MEASURE FAILED SIGNAL TOO LOW TITLE__");
                        Log.d("HeartRateHandler", "[HR] Capture session fail");
                        ScheduledFuture scheduledFuture = heartRateHandler.f58473v;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            heartRateHandler.f58473v = null;
                        }
                        ScheduledFuture scheduledFuture2 = heartRateHandler.f58475x;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            heartRateHandler.f58475x = null;
                        }
                        c cVar = heartRateHandler.f58471t;
                        if (cVar != null) {
                            cVar.j1();
                        }
                        heartRateHandler.g(HeartrateMeasureState.f58483f);
                        heartRateHandler.j(true);
                        heartRateHandler.f58459h = 0;
                    } else {
                        Log.d("HeartRateHandler", String.format("[HR] Overall signal : %.1f quality", Double.valueOf(d11)));
                        heartRateHandler.g(HeartrateMeasureState.f58481d);
                        heartRateHandler.j(true);
                        double d12 = heartRateHandler.f58467p;
                        Log.d("HeartRateHandler", "[HR] Capture session done");
                        ScheduledFuture scheduledFuture3 = heartRateHandler.f58473v;
                        if (scheduledFuture3 != null) {
                            scheduledFuture3.cancel(true);
                            heartRateHandler.f58473v = null;
                        }
                        ScheduledFuture scheduledFuture4 = heartRateHandler.f58475x;
                        if (scheduledFuture4 != null) {
                            scheduledFuture4.cancel(true);
                            heartRateHandler.f58475x = null;
                        }
                        c cVar2 = heartRateHandler.f58471t;
                        if (cVar2 != null) {
                            cVar2.W0(d12);
                        }
                    }
                    return;
                }
                double[] dArr = new double[2];
                heartRateHandler.freqEstimateZeroSix(heartRateHandler.f58461j, heartRateHandler.f58462k, heartRateHandler.f58459h, dArr);
                double d13 = dArr[0];
                heartRateHandler.f58467p = d13;
                heartRateHandler.f58468q = dArr[1];
                Log.d("HeartRateHandler", String.format("[HR] Pulse: %.4f, Signal: %.4f", Double.valueOf(d13), Double.valueOf(heartRateHandler.f58468q)));
                c cVar3 = heartRateHandler.f58471t;
                if (cVar3 != null) {
                    cVar3.n1(heartRateHandler.f58467p);
                }
                if (heartRateHandler.f58475x == null) {
                    if (heartRateHandler.f58468q > heartRateHandler.f58469r && heartRateHandler.f58467p > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        heartRateHandler.f58459h = 0;
                        heartRateHandler.f58460i = System.currentTimeMillis();
                        heartRateHandler.f58475x = heartRateHandler.f58472u.schedule(new com.withings.wiscale2.measure.heartrate.a(heartRateHandler), 12L, TimeUnit.SECONDS);
                        heartRateHandler.g(HeartrateMeasureState.f58480c);
                        heartRateHandler.j(false);
                    } else if (heartRateHandler.f58459h > 900) {
                        heartRateHandler.f58459h = 0;
                    }
                }
                if (heartRateHandler.f58475x != null && heartRateHandler.f58459h > 120) {
                    HeartrateMeasureState heartrateMeasureState = heartRateHandler.f58470s;
                    HeartrateMeasureState heartrateMeasureState2 = HeartrateMeasureState.f58479b;
                    if (heartrateMeasureState != heartrateMeasureState2) {
                        heartRateHandler.g(heartrateMeasureState2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void c(HeartRateHandler heartRateHandler) {
        heartRateHandler.f58469r = 3;
    }

    public static boolean e() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i11 = 0; i11 < Camera.getNumberOfCameras(); i11++) {
            Camera.getCameraInfo(i11, cameraInfo);
            if (cameraInfo.facing == 0) {
                if (i11 == -1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r2.get(0).equals("off") != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f() {
        /*
            r0 = 0
            r1 = 0
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r3 = r0
        L8:
            int r4 = android.hardware.Camera.getNumberOfCameras()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r3 >= r4) goto L19
            android.hardware.Camera.getCameraInfo(r3, r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            int r4 = r2.facing     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r4 != 0) goto L16
            goto L1a
        L16:
            int r3 = r3 + 1
            goto L8
        L19:
            r3 = -1
        L1a:
            android.hardware.Camera r1 = android.hardware.Camera.open(r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r1 != 0) goto L26
            if (r1 == 0) goto L25
            r1.release()
        L25:
            return r0
        L26:
            android.hardware.Camera$Parameters r2 = r1.getParameters()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r3 = r2.getFlashMode()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r3 != 0) goto L34
            r1.release()
            return r0
        L34:
            java.util.List r2 = r2.getSupportedFlashModes()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r2 == 0) goto L5e
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r3 != 0) goto L5e
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r4 = 1
            if (r3 != r4) goto L5a
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r3 = "off"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r2 == 0) goto L5a
            goto L5e
        L56:
            r0 = move-exception
            goto L6d
        L58:
            r2 = move-exception
            goto L62
        L5a:
            r1.release()
            return r4
        L5e:
            r1.release()
            return r0
        L62:
            java.lang.Class<com.withings.wiscale2.measure.heartrate.HeartRateHandler> r3 = com.withings.wiscale2.measure.heartrate.HeartRateHandler.class
            x70.b.e(r3, r2)     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L6c
            r1.release()
        L6c:
            return r0
        L6d:
            if (r1 == 0) goto L72
            r1.release()
        L72:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.measure.heartrate.HeartRateHandler.f():boolean");
    }

    private synchronized void g(HeartrateMeasureState heartrateMeasureState) {
        this.f58470s = heartrateMeasureState;
        c cVar = this.f58471t;
        if (cVar != null) {
            cVar.S(heartrateMeasureState);
        }
    }

    private synchronized void h() {
        if (this.f58473v == null && HeartrateMeasureState.f58481d != this.f58470s) {
            this.f58476y.set(false);
            this.f58473v = this.f58472u.scheduleAtFixedRate(new b(), 0L, 1L, TimeUnit.SECONDS);
            Log.d("HeartRateHandler", "[HR] startInstantPulseTimer : " + this.f58470s.toString());
            Log.d("HeartRateHandler", "[HR] Starting instantPulseTimer");
        }
    }

    private void j(boolean z5) {
        ScheduledFuture scheduledFuture = this.f58474w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f58474w = null;
        }
        if (z5) {
            this.f58469r = 5;
        }
    }

    public final void d(Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        int bitsPerPixel = (ImageFormat.getBitsPerPixel(camera.getParameters().getPreviewFormat()) * (previewSize.width * previewSize.height)) / 8;
        for (int i11 = 0; i11 < 2; i11++) {
            byte[] bArr = new byte[bitsPerPixel];
            this.f58454c.add(bArr);
            camera.addCallbackBuffer(bArr);
        }
        int i12 = previewSize.height;
        this.f58457f = i12;
        int i13 = previewSize.width;
        this.f58456e = i13;
        this.f58455d = new byte[i13 * i12 * 4];
        this.f58461j = new double[1000];
        this.f58462k = new double[1000];
        this.f58463l = new double[1000];
        this.f58464m = new int[3];
        this.f58465n = new double[1000];
        this.f58466o = new int[3];
    }

    public native void freqEstimateZeroSix(double[] dArr, double[] dArr2, int i11, double[] dArr3);

    public final void i() {
        this.f58477z.set(true);
        ScheduledFuture scheduledFuture = this.f58473v;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f58473v = null;
        }
        ScheduledFuture scheduledFuture2 = this.f58475x;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f58475x = null;
        }
        g(HeartrateMeasureState.f58482e);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        int i11;
        float f11;
        int i12;
        int i13;
        int i14;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f58477z.get()) {
            return;
        }
        int i15 = this.f58452a + 1;
        this.f58452a = i15;
        int i16 = 0;
        if (i15 % 60 == 0) {
            Log.d("HeartRateHandler", String.format("FPS: %.4f", Float.valueOf(this.f58452a / (((float) (System.currentTimeMillis() - this.f58453b)) / 1000.0f))));
            if (this.f58452a % 120 == 0) {
                this.f58453b = System.currentTimeMillis();
                this.f58452a = 0;
            }
        }
        synchronized (this.f58455d) {
            try {
                int i17 = this.f58456e;
                int i18 = (int) (i17 * 0.2d);
                int i19 = (int) (i17 * 0.2d);
                float f12 = 0.0f;
                int min = (int) Math.min(i17 - i18, Math.max(0.0f, (i17 * 0.5f) - (i18 / 2)));
                int min2 = (int) Math.min(i11 - i19, Math.max(0.0f, (this.f58457f * 0.1f) - (i19 / 2)));
                int i21 = i18 * i19;
                int i22 = 0;
                float f13 = 0.0f;
                while (i22 < i19) {
                    int i23 = i16;
                    while (i23 < i18) {
                        int i24 = this.f58456e;
                        int i25 = i23 + min;
                        int i26 = i22 + min2;
                        int i27 = ((i26 >> 1) * i24) + (this.f58457f * i24);
                        int i28 = (bArr[(i26 * i24) + i25] & 255) - 16;
                        if (i28 < 0) {
                            i28 = 0;
                        }
                        if ((i25 & 1) == 0) {
                            i14 = (bArr[i27] & 255) - 128;
                            i12 = min;
                            i13 = i14;
                        } else {
                            i12 = min;
                            i13 = 0;
                            i14 = 0;
                        }
                        int i29 = i28 * 1192;
                        f13 += (i29 - (i14 * 833)) - (i13 * 400);
                        f12 += (i14 * 1634) + i29;
                        i23++;
                        min = i12;
                        i18 = i18;
                    }
                    i22++;
                    i16 = 0;
                }
                float f14 = i21;
                float f15 = f12 / f14;
                float f16 = (f13 / f14) / f15;
                if (f15 >= 100.0f && f16 <= 0.6d) {
                    this.f58458g = 0;
                    if (this.f58470s == HeartrateMeasureState.f58482e) {
                        g(HeartrateMeasureState.f58478a);
                        this.f58474w = this.f58472u.scheduleAtFixedRate(new a(), 0L, 15L, TimeUnit.SECONDS);
                    }
                    if (this.f58460i == 0) {
                        Log.d("HeartRateHandler", "[HR] Frame 1");
                        this.f58460i = currentTimeMillis;
                    }
                    double[] dArr = this.f58461j;
                    int i31 = this.f58459h;
                    dArr[i31] = (f15 + f11) / 2.0f;
                    double[] dArr2 = this.f58462k;
                    dArr2[i31] = (currentTimeMillis - this.f58460i) / 1000.0d;
                    int i32 = i31 + 1;
                    this.f58459h = i32;
                    if (this.f58475x != null) {
                        if (i32 > 120) {
                            processLiveZeroFour(dArr, dArr2, this.f58463l, this.f58464m, this.f58465n, this.f58466o, i31 - 119);
                        } else {
                            this.f58463l[i32] = 0.5d;
                            this.f58465n[i32] = dArr2[i32];
                        }
                    }
                    if (this.f58473v == null && HeartrateMeasureState.f58481d != this.f58470s) {
                        h();
                    }
                }
                int i33 = this.f58458g + 1;
                this.f58458g = i33;
                if (i33 >= 10) {
                    this.f58458g = 0;
                    this.f58459h = 0;
                    this.f58460i = 0L;
                    ScheduledFuture scheduledFuture = this.f58473v;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f58473v = null;
                    }
                    ScheduledFuture scheduledFuture2 = this.f58475x;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                        this.f58475x = null;
                    }
                    HeartrateMeasureState heartrateMeasureState = this.f58470s;
                    HeartrateMeasureState heartrateMeasureState2 = HeartrateMeasureState.f58482e;
                    if (heartrateMeasureState != heartrateMeasureState2) {
                        g(heartrateMeasureState2);
                        j(true);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        camera.addCallbackBuffer(bArr);
    }

    public native void processLiveZeroFour(double[] dArr, double[] dArr2, double[] dArr3, int[] iArr, double[] dArr4, int[] iArr2, int i11);
}
