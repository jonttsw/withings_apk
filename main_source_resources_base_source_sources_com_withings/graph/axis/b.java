package com.withings.graph.axis;

import com.withings.graph.GraphView;
import com.withings.graph.axis.HorizontalAxis;
import com.withings.graph.axis.a;
import java.util.Locale;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import u70.m;
/* compiled from: TimeHorizontalAxis.java */
/* loaded from: classes3.dex */
public final class b extends HorizontalAxis {
    private float N;
    private boolean O;
    protected bt.a P;

    /* compiled from: TimeHorizontalAxis.java */
    /* loaded from: classes3.dex */
    public static abstract class a<S extends b, T extends a<S, T>> extends HorizontalAxis.a<S, T> {

        /* renamed from: w  reason: collision with root package name */
        private boolean f39650w;

        public a(int i11) {
            super(i11);
            this.f39650w = false;
        }

        public final void N() {
            this.f39650w = true;
        }
    }

    /* compiled from: TimeHorizontalAxis.java */
    /* renamed from: com.withings.graph.axis.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0519b implements a.b {
        C0519b() {
        }

        @Override // com.withings.graph.axis.a.b
        public final String c(float f11, float f12) {
            b bVar = b.this;
            if (bVar.f39609c) {
                int n11 = bVar.P.n(bVar.N);
                if (n11 != -1) {
                    if (n11 != 1 && n11 != 7) {
                        if (n11 != 31 && n11 != 92) {
                            if (n11 != 365) {
                                return DateTimeFormat.forStyle("M-").print(bt.a.e(f11));
                            }
                        } else {
                            DateTime e11 = bt.a.e(f11);
                            String language = Locale.getDefault().getLanguage();
                            if (!language.equals(Locale.CHINESE.getLanguage()) && !language.equals(Locale.SIMPLIFIED_CHINESE.getLanguage()) && !language.equals(Locale.TRADITIONAL_CHINESE.getLanguage()) && !language.equals(Locale.JAPANESE.getLanguage())) {
                                String print = DateTimeFormat.forPattern("MMM yyyy").print(e11);
                                return print.substring(0, 1).toUpperCase() + print.substring(1, print.length());
                            }
                            return DateTimeFormat.forPattern("yyyy MMM").print(e11);
                        }
                    } else {
                        return DateTimeFormat.forStyle("M-").print(bt.a.e(f11));
                    }
                }
                return DateTimeFormat.forPattern("yyyy").print(bt.a.e(f11));
            }
            int n12 = bVar.P.n(bVar.N);
            if (n12 != -1) {
                if (n12 != 1) {
                    if (n12 != 7) {
                        if (n12 != 31) {
                            if (n12 != 92) {
                                if (n12 != 365) {
                                    return DateTimeFormat.forStyle("M-").print(bt.a.e(f11));
                                }
                                return m.a(DateTimeFormat.forPattern("MMM").print(bt.a.e(f11)).substring(0, 1));
                            }
                            return m.a(DateTimeFormat.forPattern("MMMM").print(bt.a.e(f11)));
                        }
                        return m.a(DateTimeFormat.forPattern("EEE dd").print(bt.a.e(f11)));
                    }
                    return m.a(DateTimeFormat.forPattern("EEE").print(bt.a.e(f11)));
                }
                return DateTimeFormat.forPattern("HH").print(bt.a.e(f11).hourOfDay().roundHalfEvenCopy());
            }
            return DateTimeFormat.forPattern("yyyy").print(bt.a.e(f11));
        }
    }

    /* compiled from: TimeHorizontalAxis.java */
    /* loaded from: classes3.dex */
    public static class c extends a<b, c> {
        public final b O() {
            return new b(this);
        }
    }

    protected b(a<?, ?> aVar) {
        super(aVar);
        if (this.f39610d == null) {
            this.f39610d = new C0519b();
        }
        this.O = ((a) aVar).f39650w;
    }

    @Override // com.withings.graph.axis.HorizontalAxis
    public final void f(GraphView graphView) {
        float f11;
        ls.a aVar;
        int i11;
        int i12;
        this.N = (graphView.getCurrentViewport().right - graphView.getCurrentViewport().left) + 3.0f;
        float f12 = graphView.getCurrentViewport().left;
        float f13 = graphView.getCurrentViewport().right;
        int n11 = this.P.n(this.N);
        ls.a aVar2 = this.E;
        int i13 = 12;
        if (this.f39609c) {
            float j5 = this.P.j(n11);
            boolean z5 = this.O;
            if (!z5) {
                i13 = ((int) Math.ceil(f11 / j5)) + 1;
            }
            aVar2.f80101b = i13;
            aVar2.f80100a = new float[i13];
            if (n11 == 92) {
                j5 = this.P.j(31);
            }
            float f14 = f12 - j5;
            for (int i14 = 0; i14 < aVar2.f80101b; i14++) {
                float[] fArr = aVar2.f80100a;
                int i15 = (int) f14;
                DateTime c11 = this.P.c();
                if (n11 != 1) {
                    if (n11 != 7) {
                        if (n11 != 31 && n11 != 92) {
                            if (n11 != 365) {
                                i12 = Days.daysBetween(c11, c11.plusDays(i15).plusYears(1).withDayOfYear(1)).getDays();
                            } else if (z5) {
                                i12 = Days.daysBetween(c11, c11.plusDays(i15).plusMonths(1).withDayOfMonth(1)).getDays();
                            } else {
                                i12 = Days.daysBetween(c11, c11.plusDays(i15).plusYears(1).withDayOfYear(1)).getDays();
                            }
                        } else {
                            i12 = Days.daysBetween(c11, c11.plusDays(i15).plusMonths(1).withDayOfMonth(1)).getDays();
                        }
                    } else {
                        i12 = Days.daysBetween(c11, c11.plusDays(i15).plusWeeks(1).withDayOfWeek(1)).getDays();
                    }
                } else {
                    i12 = i15 + 1;
                }
                fArr[i14] = i12;
                f14 = aVar2.f80100a[i14];
            }
        } else {
            DateTime startDate = bt.a.e(f12);
            DateTime endDate = bt.a.e(f13);
            if (n11 != 1) {
                if (n11 != 7) {
                    if (n11 != 31) {
                        int i16 = 3;
                        if (n11 != 92) {
                            if (n11 != 365) {
                                u.j(startDate, "startDate");
                                u.j(endDate, "endDate");
                                int abs = Math.abs(Years.yearsBetween(endDate, startDate).getYears());
                                if (abs < 4) {
                                    i11 = 1;
                                } else {
                                    i11 = ((abs % 2) + abs) / 4;
                                }
                                if (abs - (i11 * 4) <= i11) {
                                    i16 = 4;
                                }
                                aVar = new ls.a();
                                int min = Math.min(abs, i16);
                                aVar.f80101b = min;
                                aVar.f80100a = new float[min];
                                DateTime withTimeAtStartOfDay = startDate.plusYears(1).withDayOfYear(1).withTimeAtStartOfDay();
                                int length = aVar.f80100a.length;
                                for (int i17 = 0; i17 < length; i17++) {
                                    aVar.f80100a[i17] = bt.a.i(withTimeAtStartOfDay);
                                    withTimeAtStartOfDay = withTimeAtStartOfDay.plusYears((4 - i16) + i11);
                                }
                            } else {
                                u.j(startDate, "startDate");
                                u.j(endDate, "endDate");
                                aVar = new ls.a();
                                aVar.f80101b = 12;
                                aVar.f80100a = new float[12];
                                DateTime withTimeAtStartOfDay2 = startDate.plusMonths(1).withDayOfMonth(1).withTimeAtStartOfDay();
                                for (int i18 = 0; i18 < 12; i18++) {
                                    aVar.f80100a[i18] = bt.a.i(withTimeAtStartOfDay2);
                                    withTimeAtStartOfDay2 = withTimeAtStartOfDay2.plusMonths(1);
                                }
                            }
                        } else {
                            u.j(startDate, "startDate");
                            u.j(endDate, "endDate");
                            aVar = new ls.a();
                            aVar.f80101b = 3;
                            aVar.f80100a = new float[3];
                            DateTime withTimeAtStartOfDay3 = startDate.plusMonths(1).withDayOfMonth(1).withTimeAtStartOfDay();
                            for (int i19 = 0; i19 < 3; i19++) {
                                aVar.f80100a[i19] = bt.a.i(withTimeAtStartOfDay3);
                                withTimeAtStartOfDay3 = withTimeAtStartOfDay3.plusMonths(1);
                            }
                        }
                    } else {
                        u.j(startDate, "startDate");
                        u.j(endDate, "endDate");
                        aVar = new ls.a();
                        aVar.f80101b = 5;
                        aVar.f80100a = new float[5];
                        DateTime withTimeAtStartOfDay4 = startDate.withDayOfWeek(1).withTimeAtStartOfDay();
                        for (int i21 = 0; i21 < 5; i21++) {
                            aVar.f80100a[i21] = bt.a.i(withTimeAtStartOfDay4);
                            withTimeAtStartOfDay4 = withTimeAtStartOfDay4.plusWeeks(1);
                        }
                    }
                } else {
                    u.j(startDate, "startDate");
                    u.j(endDate, "endDate");
                    aVar = new ls.a();
                    aVar.f80101b = 7;
                    aVar.f80100a = new float[7];
                    DateTime withTimeAtStartOfDay5 = startDate.plusDays(1).withTimeAtStartOfDay();
                    for (int i22 = 0; i22 < 7; i22++) {
                        aVar.f80100a[i22] = bt.a.i(withTimeAtStartOfDay5);
                        withTimeAtStartOfDay5 = withTimeAtStartOfDay5.plusDays(1);
                    }
                }
            } else {
                u.j(startDate, "startDate");
                u.j(endDate, "endDate");
                aVar = new ls.a();
                aVar.f80101b = 6;
                aVar.f80100a = new float[6];
                DateTime plusHours = startDate.withTimeAtStartOfDay().withHourOfDay((startDate.getHourOfDay() / 4) * 4).plusHours(4);
                u.i(plusHours, "plusHours(...)");
                for (int i23 = 0; i23 < 6; i23++) {
                    aVar.f80100a[i23] = bt.a.i(plusHours);
                    plusHours = plusHours.plusHours(4);
                    u.i(plusHours, "plusHours(...)");
                }
            }
            aVar2.f80101b = aVar.f80101b;
            aVar2.f80100a = aVar.f80100a;
        }
        int length2 = this.F.length;
        int i24 = aVar2.f80101b;
        if (length2 < i24) {
            this.F = new float[i24];
        }
        int i25 = i24 * 4;
        if (this.G.length < i25) {
            this.G = new float[i25];
        }
        for (int i26 = 0; i26 < aVar2.f80101b; i26++) {
            this.F[i26] = graphView.q(aVar2.f80100a[i26]);
        }
    }

    public final void k(bt.a aVar) {
        this.P = aVar;
        aVar.q(this.O);
    }
}
