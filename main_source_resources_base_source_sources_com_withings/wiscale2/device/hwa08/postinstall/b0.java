package com.withings.wiscale2.device.hwa08.postinstall;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.google.android.filament.Camera;
import com.google.android.filament.Scene;
import com.google.android.filament.View;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Weeks;
import org.joda.time.Years;
import qk.a1;
import qk.a2;
import qk.a3;
import qk.a4;
import qk.a5;
import qk.a6;
import qk.a7;
import qk.a8;
import qk.a9;
import qk.aa;
import qk.ab;
import qk.ac;
import qk.ad;
import qk.ae;
import qk.b1;
import qk.b2;
import qk.b3;
import qk.b4;
import qk.b5;
import qk.b6;
import qk.b7;
import qk.b8;
import qk.b9;
import qk.ba;
import qk.bb;
import qk.bc;
import qk.bd;
import qk.be;
import qk.c1;
import qk.c2;
import qk.c3;
import qk.c4;
import qk.c5;
import qk.c6;
import qk.c7;
import qk.c8;
import qk.c9;
import qk.ca;
import qk.cb;
import qk.cc;
import qk.cd;
import qk.ce;
import qk.d0;
import qk.d1;
import qk.d2;
import qk.d3;
import qk.d4;
import qk.d5;
import qk.d6;
import qk.d7;
import qk.d8;
import qk.d9;
import qk.da;
import qk.db;
import qk.dc;
import qk.dd;
import qk.de;
import qk.e0;
import qk.e1;
import qk.e2;
import qk.e3;
import qk.e4;
import qk.e5;
import qk.e6;
import qk.e7;
import qk.e8;
import qk.e9;
import qk.ea;
import qk.eb;
import qk.ec;
import qk.ed;
import qk.ee;
import qk.f0;
import qk.f1;
import qk.f2;
import qk.f3;
import qk.f4;
import qk.f5;
import qk.f6;
import qk.f7;
import qk.f8;
import qk.f9;
import qk.fa;
import qk.fb;
import qk.fc;
import qk.fd;
import qk.fe;
import qk.g0;
import qk.g1;
import qk.g2;
import qk.g3;
import qk.g4;
import qk.g5;
import qk.g6;
import qk.g7;
import qk.g8;
import qk.g9;
import qk.ga;
import qk.gb;
import qk.gc;
import qk.gd;
import qk.ge;
import qk.h0;
import qk.h1;
import qk.h2;
import qk.h3;
import qk.h4;
import qk.h5;
import qk.h6;
import qk.h7;
import qk.h8;
import qk.h9;
import qk.ha;
import qk.hb;
import qk.hc;
import qk.hd;
import qk.he;
import qk.i0;
import qk.i1;
import qk.i2;
import qk.i3;
import qk.i4;
import qk.i5;
import qk.i6;
import qk.i7;
import qk.i8;
import qk.i9;
import qk.ia;
import qk.ib;
import qk.ic;
import qk.id;
import qk.ie;
import qk.j0;
import qk.j1;
import qk.j2;
import qk.j3;
import qk.j4;
import qk.j5;
import qk.j6;
import qk.j7;
import qk.j8;
import qk.j9;
import qk.ja;
import qk.jb;
import qk.jc;
import qk.jd;
import qk.je;
import qk.k0;
import qk.k1;
import qk.k2;
import qk.k3;
import qk.k4;
import qk.k5;
import qk.k6;
import qk.k7;
import qk.k8;
import qk.k9;
import qk.ka;
import qk.kb;
import qk.kc;
import qk.kd;
import qk.l0;
import qk.l1;
import qk.l2;
import qk.l3;
import qk.l4;
import qk.l5;
import qk.l6;
import qk.l7;
import qk.l8;
import qk.l9;
import qk.la;
import qk.lb;
import qk.lc;
import qk.ld;
import qk.m0;
import qk.m1;
import qk.m2;
import qk.m3;
import qk.m4;
import qk.m5;
import qk.m6;
import qk.m7;
import qk.m8;
import qk.m9;
import qk.ma;
import qk.mb;
import qk.mc;
import qk.md;
import qk.n0;
import qk.n1;
import qk.n2;
import qk.n3;
import qk.n4;
import qk.n5;
import qk.n6;
import qk.n7;
import qk.n8;
import qk.n9;
import qk.na;
import qk.nb;
import qk.nc;
import qk.nd;
import qk.o0;
import qk.o1;
import qk.o2;
import qk.o3;
import qk.o4;
import qk.o5;
import qk.o6;
import qk.o7;
import qk.o8;
import qk.o9;
import qk.oa;
import qk.ob;
import qk.oc;
import qk.od;
import qk.p0;
import qk.p1;
import qk.p2;
import qk.p3;
import qk.p4;
import qk.p5;
import qk.p6;
import qk.p7;
import qk.p8;
import qk.p9;
import qk.pa;
import qk.pb;
import qk.pc;
import qk.pd;
import qk.q0;
import qk.q1;
import qk.q2;
import qk.q3;
import qk.q4;
import qk.q5;
import qk.q6;
import qk.q7;
import qk.q8;
import qk.q9;
import qk.qa;
import qk.qb;
import qk.qc;
import qk.qd;
import qk.r0;
import qk.r1;
import qk.r2;
import qk.r3;
import qk.r4;
import qk.r5;
import qk.r6;
import qk.r7;
import qk.r8;
import qk.r9;
import qk.ra;
import qk.rb;
import qk.rc;
import qk.rd;
import qk.s0;
import qk.s1;
import qk.s2;
import qk.s3;
import qk.s4;
import qk.s5;
import qk.s6;
import qk.s7;
import qk.s8;
import qk.s9;
import qk.sa;
import qk.sb;
import qk.sc;
import qk.sd;
import qk.t0;
import qk.t1;
import qk.t2;
import qk.t3;
import qk.t4;
import qk.t5;
import qk.t6;
import qk.t7;
import qk.t8;
import qk.t9;
import qk.ta;
import qk.tb;
import qk.tc;
import qk.td;
import qk.u0;
import qk.u1;
import qk.u2;
import qk.u3;
import qk.u4;
import qk.u5;
import qk.u6;
import qk.u7;
import qk.u8;
import qk.u9;
import qk.ua;
import qk.ub;
import qk.uc;
import qk.ud;
import qk.v0;
import qk.v1;
import qk.v2;
import qk.v3;
import qk.v4;
import qk.v5;
import qk.v6;
import qk.v7;
import qk.v8;
import qk.v9;
import qk.va;
import qk.vb;
import qk.vc;
import qk.vd;
import qk.w0;
import qk.w1;
import qk.w2;
import qk.w3;
import qk.w4;
import qk.w5;
import qk.w6;
import qk.w7;
import qk.w8;
import qk.w9;
import qk.wa;
import qk.wb;
import qk.wc;
import qk.wd;
import qk.x0;
import qk.x1;
import qk.x2;
import qk.x3;
import qk.x4;
import qk.x5;
import qk.x6;
import qk.x7;
import qk.x8;
import qk.x9;
import qk.xa;
import qk.xb;
import qk.xc;
import qk.xd;
import qk.y0;
import qk.y1;
import qk.y2;
import qk.y3;
import qk.y4;
import qk.y5;
import qk.y6;
import qk.y7;
import qk.y8;
import qk.y9;
import qk.ya;
import qk.yb;
import qk.yc;
import qk.yd;
import qk.z0;
import qk.z1;
import qk.z2;
import qk.z3;
import qk.z4;
import qk.z5;
import qk.z6;
import qk.z7;
import qk.z8;
import qk.z9;
import qk.za;
import qk.zb;
import qk.zc;
import qk.zd;
/* compiled from: Hwa08PostInstallActivity_MembersInjector.java */
/* loaded from: classes5.dex */
public final class b0 implements ak0.b {
    public static byte[] A(byte[] bArr, byte[] bArr2) {
        byte[] c11 = re.b.c(16);
        byte[] B = B(bArr, bArr2, c11);
        byte[] bArr3 = new byte[c11.length + B.length];
        System.arraycopy(c11, 0, bArr3, 0, c11.length);
        System.arraycopy(B, 0, bArr3, c11.length, B.length);
        return bArr3;
    }

    public static byte[] B(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            androidx.collection.c.e("CBC", "encrypt 6 content is null");
            return new byte[0];
        } else if (bArr.length == 0) {
            androidx.collection.c.e("CBC", "encrypt 6 content length is 0");
            return new byte[0];
        } else if (bArr2 == null) {
            androidx.collection.c.e("CBC", "encrypt 6 key is null");
            return new byte[0];
        } else if (bArr2.length < 16) {
            androidx.collection.c.e("CBC", "encrypt 6 key length is error");
            return new byte[0];
        } else if (bArr3.length < 16) {
            androidx.collection.c.e("CBC", "encrypt 6 iv length is error");
            return new byte[0];
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException e11) {
                androidx.collection.c.e("CBC", "InvalidAlgorithmParameterException: " + e11.getMessage());
                return new byte[0];
            } catch (InvalidKeyException e12) {
                androidx.collection.c.e("CBC", "InvalidKeyException: " + e12.getMessage());
                return new byte[0];
            } catch (NoSuchAlgorithmException e13) {
                androidx.collection.c.e("CBC", "NoSuchAlgorithmException: " + e13.getMessage());
                return new byte[0];
            } catch (BadPaddingException e14) {
                androidx.collection.c.e("CBC", "BadPaddingException: " + e14.getMessage());
                return new byte[0];
            } catch (IllegalBlockSizeException e15) {
                androidx.collection.c.e("CBC", "IllegalBlockSizeException: " + e15.getMessage());
                return new byte[0];
            } catch (NoSuchPaddingException e16) {
                androidx.collection.c.e("CBC", "NoSuchPaddingException: " + e16.getMessage());
                return new byte[0];
            }
        }
    }

    public static final wm.i C(fx.f fVar) {
        kotlin.jvm.internal.u.j(fVar, "<this>");
        return new wm.i(fVar.g(), fVar.k(), fVar.j(), fVar.d(), fVar.c());
    }

    public static final int D(Activity activity, String extra) {
        kotlin.jvm.internal.u.j(activity, "<this>");
        kotlin.jvm.internal.u.j(extra, "extra");
        if (activity.getIntent().hasExtra(extra)) {
            return activity.getIntent().getIntExtra(extra, Integer.MIN_VALUE);
        }
        throw new NullPointerException(String.format("extra %s not expected to be null", Arrays.copyOf(new Object[]{extra}, 1)));
    }

    public static final long E(Activity activity, String extra) {
        kotlin.jvm.internal.u.j(activity, "<this>");
        kotlin.jvm.internal.u.j(extra, "extra");
        if (activity.getIntent().hasExtra(extra)) {
            return activity.getIntent().getLongExtra(extra, Long.MIN_VALUE);
        }
        throw new NullPointerException(String.format("extra %s not expected to be null", Arrays.copyOf(new Object[]{extra}, 1)));
    }

    public static final Parcelable F(Activity activity, String extra) {
        Parcelable parcelable;
        kotlin.jvm.internal.u.j(activity, "<this>");
        kotlin.jvm.internal.u.j(extra, "extra");
        Bundle extras = activity.getIntent().getExtras();
        Parcelable parcelable2 = null;
        if (extras != null) {
            parcelable = extras.getParcelable(extra);
        } else {
            parcelable = null;
        }
        if (parcelable instanceof Parcelable) {
            parcelable2 = parcelable;
        }
        if (parcelable2 != null) {
            return parcelable2;
        }
        throw new NullPointerException(String.format("extra %s not expected to be null", Arrays.copyOf(new Object[]{extra}, 1)));
    }

    public static final int G(qk.a aVar) {
        kotlin.jvm.internal.u.j(aVar, "<this>");
        if (kotlin.jvm.internal.u.e(aVar, qk.b.f92851a)) {
            return C1987R.drawable.icon_large_anatomical_artery;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.c.f92867a)) {
            return C1987R.drawable.icon_large_anatomical_bone;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.d.f92883a)) {
            return C1987R.drawable.icon_large_anatomical_breathing;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.e.f92899a)) {
            return C1987R.drawable.icon_large_anatomical_drop;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.f.f92915a)) {
            return C1987R.drawable.icon_large_anatomical_ecg;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.g.f92931a)) {
            return C1987R.drawable.icon_large_anatomical_fat;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.h.f92947a)) {
            return C1987R.drawable.icon_large_anatomical_flame;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.i.f92963a)) {
            return C1987R.drawable.icon_large_anatomical_heart;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.j.f92979a)) {
            return C1987R.drawable.icon_large_anatomical_muscle;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.k.f92995a)) {
            return C1987R.drawable.icon_large_anatomical_nervehealth;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.l.f93010a)) {
            return C1987R.drawable.icon_large_anatomical_sleepcycle;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.m.f93025a)) {
            return C1987R.drawable.icon_large_anatomical_snoring;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.n.f93040a)) {
            return C1987R.drawable.icon_large_device_body;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.o.f93055a)) {
            return C1987R.drawable.icon_large_device_bodycardio;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.p.f93070a)) {
            return C1987R.drawable.icon_large_device_bodycomp;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.q.f93085a)) {
            return C1987R.drawable.icon_large_device_bodyplus;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.r.f93100a)) {
            return C1987R.drawable.icon_large_device_bodyplustype;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.s.f93115a)) {
            return C1987R.drawable.icon_large_device_bodyscan;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.t.f93130a)) {
            return C1987R.drawable.icon_large_device_bodysmart;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.u.f93145a)) {
            return C1987R.drawable.icon_large_device_bpmconnect;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.v.f93160a)) {
            return C1987R.drawable.icon_large_device_bpmcore;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.w.f93175a)) {
            return C1987R.drawable.icon_large_device_compare_watches;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.x.f93190a)) {
            return C1987R.drawable.icon_large_device_comparebpm;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.y.f93205a)) {
            return C1987R.drawable.icon_large_device_comparescales;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.z.f93220a)) {
            return C1987R.drawable.icon_large_device_datahub;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.a0.f92836a)) {
            return C1987R.drawable.icon_large_device_laptop;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.b0.f92852a)) {
            return C1987R.drawable.icon_large_device_pulsehr;
        }
        if (kotlin.jvm.internal.u.e(aVar, qk.c0.f92868a)) {
            return C1987R.drawable.icon_large_device_scalehandle;
        }
        if (kotlin.jvm.internal.u.e(aVar, d0.f92884a)) {
            return C1987R.drawable.icon_large_device_scanwatch38;
        }
        if (kotlin.jvm.internal.u.e(aVar, e0.f92900a)) {
            return C1987R.drawable.icon_large_device_scanwatch42;
        }
        if (kotlin.jvm.internal.u.e(aVar, f0.f92916a)) {
            return C1987R.drawable.icon_large_device_scanwatchhorizon;
        }
        if (kotlin.jvm.internal.u.e(aVar, g0.f92932a)) {
            return C1987R.drawable.icon_large_device_sleepanalyzer;
        }
        if (kotlin.jvm.internal.u.e(aVar, h0.f92948a)) {
            return C1987R.drawable.icon_large_device_thermo;
        }
        if (kotlin.jvm.internal.u.e(aVar, i0.f92964a)) {
            return C1987R.drawable.icon_large_device_uscan;
        }
        if (kotlin.jvm.internal.u.e(aVar, j0.f92980a)) {
            return C1987R.drawable.icon_large_device_wristband;
        }
        if (kotlin.jvm.internal.u.e(aVar, k0.f92996a)) {
            return C1987R.drawable.icon_large_feature_atm;
        }
        if (kotlin.jvm.internal.u.e(aVar, l0.f93011a)) {
            return C1987R.drawable.icon_large_feature_battery6;
        }
        if (kotlin.jvm.internal.u.e(aVar, m0.f93026a)) {
            return C1987R.drawable.icon_large_feature_bezel;
        }
        if (kotlin.jvm.internal.u.e(aVar, n0.f93041a)) {
            return C1987R.drawable.icon_large_feature_cellular;
        }
        if (kotlin.jvm.internal.u.e(aVar, o0.f93056a)) {
            return C1987R.drawable.icon_large_feature_clock;
        }
        if (kotlin.jvm.internal.u.e(aVar, p0.f93071a)) {
            return C1987R.drawable.icon_large_feature_cloud;
        }
        if (kotlin.jvm.internal.u.e(aVar, q0.f93086a)) {
            return C1987R.drawable.icon_large_feature_colorcodedresults;
        }
        if (kotlin.jvm.internal.u.e(aVar, r0.f93101a)) {
            return C1987R.drawable.icon_large_feature_colorscreen;
        }
        if (kotlin.jvm.internal.u.e(aVar, s0.f93116a)) {
            return C1987R.drawable.icon_large_feature_data;
        }
        if (kotlin.jvm.internal.u.e(aVar, t0.f93131a)) {
            return C1987R.drawable.icon_large_feature_dollar;
        }
        if (kotlin.jvm.internal.u.e(aVar, u0.f93146a)) {
            return C1987R.drawable.icon_large_feature_elevation;
        }
        if (kotlin.jvm.internal.u.e(aVar, v0.f93161a)) {
            return C1987R.drawable.icon_large_feature_gauge;
        }
        if (kotlin.jvm.internal.u.e(aVar, w0.f93176a)) {
            return C1987R.drawable.icon_large_feature_glass;
        }
        if (kotlin.jvm.internal.u.e(aVar, x0.f93191a)) {
            return C1987R.drawable.icon_large_feature_location;
        }
        if (kotlin.jvm.internal.u.e(aVar, y0.f93206a)) {
            return C1987R.drawable.icon_large_feature_luminova;
        }
        if (kotlin.jvm.internal.u.e(aVar, z0.f93221a)) {
            return C1987R.drawable.icon_large_feature_medicalreport;
        }
        if (kotlin.jvm.internal.u.e(aVar, a1.f92837a)) {
            return C1987R.drawable.icon_large_feature_notification;
        }
        if (kotlin.jvm.internal.u.e(aVar, b1.f92853a)) {
            return C1987R.drawable.icon_large_feature_partnership;
        }
        if (kotlin.jvm.internal.u.e(aVar, c1.f92869a)) {
            return C1987R.drawable.icon_large_feature_precision;
        }
        if (kotlin.jvm.internal.u.e(aVar, d1.f92885a)) {
            return C1987R.drawable.icon_large_feature_score;
        }
        if (kotlin.jvm.internal.u.e(aVar, e1.f92901a)) {
            return C1987R.drawable.icon_large_feature_shipping;
        }
        if (kotlin.jvm.internal.u.e(aVar, f1.f92917a)) {
            return C1987R.drawable.icon_large_feature_trend;
        }
        if (kotlin.jvm.internal.u.e(aVar, g1.f92933a)) {
            return C1987R.drawable.icon_large_feature_trial30d;
        }
        if (kotlin.jvm.internal.u.e(aVar, h1.f92949a)) {
            return C1987R.drawable.icon_large_feature_userrecognition;
        }
        if (kotlin.jvm.internal.u.e(aVar, i1.f92965a)) {
            return C1987R.drawable.icon_large_feature_warranty2y;
        }
        if (kotlin.jvm.internal.u.e(aVar, j1.f92981a)) {
            return C1987R.drawable.icon_large_feature_warranty5y;
        }
        if (kotlin.jvm.internal.u.e(aVar, k1.f92997a)) {
            return C1987R.drawable.icon_large_feature_weather;
        }
        if (kotlin.jvm.internal.u.e(aVar, l1.f93012a)) {
            return C1987R.drawable.icon_large_feature_wifilvl4;
        }
        if (kotlin.jvm.internal.u.e(aVar, m1.f93027a)) {
            return C1987R.drawable.icon_medium_activity_archery;
        }
        if (kotlin.jvm.internal.u.e(aVar, n1.f93042a)) {
            return C1987R.drawable.icon_medium_activity_athletics;
        }
        if (kotlin.jvm.internal.u.e(aVar, o1.f93057a)) {
            return C1987R.drawable.icon_medium_activity_badminton;
        }
        if (kotlin.jvm.internal.u.e(aVar, p1.f93072a)) {
            return C1987R.drawable.icon_medium_activity_baseball;
        }
        if (kotlin.jvm.internal.u.e(aVar, q1.f93087a)) {
            return C1987R.drawable.icon_medium_activity_basketball;
        }
        if (kotlin.jvm.internal.u.e(aVar, r1.f93102a)) {
            return C1987R.drawable.icon_medium_activity_beachvolley;
        }
        if (kotlin.jvm.internal.u.e(aVar, s1.f93117a)) {
            return C1987R.drawable.icon_medium_activity_bike;
        }
        if (kotlin.jvm.internal.u.e(aVar, t1.f93132a)) {
            return C1987R.drawable.icon_medium_activity_bmx;
        }
        if (kotlin.jvm.internal.u.e(aVar, u1.f93147a)) {
            return C1987R.drawable.icon_medium_activity_bodyboard;
        }
        if (kotlin.jvm.internal.u.e(aVar, v1.f93162a)) {
            return C1987R.drawable.icon_medium_activity_boxing;
        }
        if (kotlin.jvm.internal.u.e(aVar, w1.f93177a)) {
            return C1987R.drawable.icon_medium_activity_breaking;
        }
        if (kotlin.jvm.internal.u.e(aVar, x1.f93192a)) {
            return C1987R.drawable.icon_medium_activity_canoe;
        }
        if (kotlin.jvm.internal.u.e(aVar, y1.f93207a)) {
            return C1987R.drawable.icon_medium_activity_chores;
        }
        if (kotlin.jvm.internal.u.e(aVar, z1.f93222a)) {
            return C1987R.drawable.icon_medium_activity_climbing;
        }
        if (kotlin.jvm.internal.u.e(aVar, a2.f92838a)) {
            return C1987R.drawable.icon_medium_activity_cornhole;
        }
        if (kotlin.jvm.internal.u.e(aVar, b2.f92854a)) {
            return C1987R.drawable.icon_medium_activity_custom;
        }
        if (kotlin.jvm.internal.u.e(aVar, c2.f92870a)) {
            return C1987R.drawable.icon_medium_activity_cyclingindoor;
        }
        if (kotlin.jvm.internal.u.e(aVar, d2.f92886a)) {
            return C1987R.drawable.icon_medium_activity_cyclingtrack;
        }
        if (kotlin.jvm.internal.u.e(aVar, e2.f92902a)) {
            return C1987R.drawable.icon_medium_activity_dance;
        }
        if (kotlin.jvm.internal.u.e(aVar, f2.f92918a)) {
            return C1987R.drawable.icon_medium_activity_diving;
        }
        if (kotlin.jvm.internal.u.e(aVar, g2.f92934a)) {
            return C1987R.drawable.icon_medium_activity_dodgeball;
        }
        if (kotlin.jvm.internal.u.e(aVar, h2.f92950a)) {
            return C1987R.drawable.icon_medium_activity_elliptical;
        }
        if (kotlin.jvm.internal.u.e(aVar, i2.f92966a)) {
            return C1987R.drawable.icon_medium_activity_fencing;
        }
        if (kotlin.jvm.internal.u.e(aVar, j2.f92982a)) {
            return C1987R.drawable.icon_medium_activity_fitness;
        }
        if (kotlin.jvm.internal.u.e(aVar, k2.f92998a)) {
            return C1987R.drawable.icon_medium_activity_football;
        }
        if (kotlin.jvm.internal.u.e(aVar, l2.f93013a)) {
            return C1987R.drawable.icon_medium_activity_frisbee;
        }
        if (kotlin.jvm.internal.u.e(aVar, m2.f93028a)) {
            return C1987R.drawable.icon_medium_activity_gaming;
        }
        if (kotlin.jvm.internal.u.e(aVar, n2.f93043a)) {
            return C1987R.drawable.icon_medium_activity_golf;
        }
        if (kotlin.jvm.internal.u.e(aVar, o2.f93058a)) {
            return C1987R.drawable.icon_medium_activity_handball;
        }
        if (kotlin.jvm.internal.u.e(aVar, p2.f93073a)) {
            return C1987R.drawable.icon_medium_activity_hike;
        }
        if (kotlin.jvm.internal.u.e(aVar, q2.f93088a)) {
            return C1987R.drawable.icon_medium_activity_hiphop;
        }
        if (kotlin.jvm.internal.u.e(aVar, r2.f93103a)) {
            return C1987R.drawable.icon_medium_activity_hockey;
        }
        if (kotlin.jvm.internal.u.e(aVar, s2.f93118a)) {
            return C1987R.drawable.icon_medium_activity_horseriding;
        }
        if (kotlin.jvm.internal.u.e(aVar, t2.f93133a)) {
            return C1987R.drawable.icon_medium_activity_icehockey;
        }
        if (kotlin.jvm.internal.u.e(aVar, u2.f93148a)) {
            return C1987R.drawable.icon_medium_activity_iceskate;
        }
        if (kotlin.jvm.internal.u.e(aVar, v2.f93163a)) {
            return C1987R.drawable.icon_medium_activity_judo;
        }
        if (kotlin.jvm.internal.u.e(aVar, w2.f93178a)) {
            return C1987R.drawable.icon_medium_activity_kitesurf;
        }
        if (kotlin.jvm.internal.u.e(aVar, x2.f93193a)) {
            return C1987R.drawable.icon_medium_activity_martialarts;
        }
        if (kotlin.jvm.internal.u.e(aVar, y2.f93208a)) {
            return C1987R.drawable.icon_medium_activity_muaythai;
        }
        if (kotlin.jvm.internal.u.e(aVar, z2.f93223a)) {
            return C1987R.drawable.icon_medium_activity_paddleboarding;
        }
        if (kotlin.jvm.internal.u.e(aVar, a3.f92839a)) {
            return C1987R.drawable.icon_medium_activity_padel;
        }
        if (kotlin.jvm.internal.u.e(aVar, b3.f92855a)) {
            return C1987R.drawable.icon_medium_activity_pentathlon;
        }
        if (kotlin.jvm.internal.u.e(aVar, c3.f92871a)) {
            return C1987R.drawable.icon_medium_activity_pickleball;
        }
        if (kotlin.jvm.internal.u.e(aVar, d3.f92887a)) {
            return C1987R.drawable.icon_medium_activity_pilates;
        }
        if (kotlin.jvm.internal.u.e(aVar, e3.f92903a)) {
            return C1987R.drawable.icon_medium_activity_pingpong;
        }
        if (kotlin.jvm.internal.u.e(aVar, f3.f92919a)) {
            return C1987R.drawable.icon_medium_activity_rowing;
        }
        if (kotlin.jvm.internal.u.e(aVar, g3.f92935a)) {
            return C1987R.drawable.icon_medium_activity_rugby;
        }
        if (kotlin.jvm.internal.u.e(aVar, i3.f92967a)) {
            return C1987R.drawable.icon_medium_activity_run;
        }
        if (kotlin.jvm.internal.u.e(aVar, h3.f92951a)) {
            return C1987R.drawable.icon_medium_activity_run2;
        }
        if (kotlin.jvm.internal.u.e(aVar, j3.f92983a)) {
            return C1987R.drawable.icon_medium_activity_sailing;
        }
        if (kotlin.jvm.internal.u.e(aVar, k3.f92999a)) {
            return C1987R.drawable.icon_medium_activity_seatedcardio;
        }
        if (kotlin.jvm.internal.u.e(aVar, l3.f93014a)) {
            return C1987R.drawable.icon_medium_activity_seatedstrength;
        }
        if (kotlin.jvm.internal.u.e(aVar, m3.f93029a)) {
            return C1987R.drawable.icon_medium_activity_sexualactivity;
        }
        if (kotlin.jvm.internal.u.e(aVar, n3.f93044a)) {
            return C1987R.drawable.icon_medium_activity_shooting;
        }
        if (kotlin.jvm.internal.u.e(aVar, o3.f93059a)) {
            return C1987R.drawable.icon_medium_activity_skate;
        }
        if (kotlin.jvm.internal.u.e(aVar, p3.f93074a)) {
            return C1987R.drawable.icon_medium_activity_skateboard;
        }
        if (kotlin.jvm.internal.u.e(aVar, q3.f93089a)) {
            return C1987R.drawable.icon_medium_activity_ski;
        }
        if (kotlin.jvm.internal.u.e(aVar, r3.f93104a)) {
            return C1987R.drawable.icon_medium_activity_skydiving;
        }
        if (kotlin.jvm.internal.u.e(aVar, s3.f93119a)) {
            return C1987R.drawable.icon_medium_activity_sleep;
        }
        if (kotlin.jvm.internal.u.e(aVar, t3.f93134a)) {
            return C1987R.drawable.icon_medium_activity_snowboard;
        }
        if (kotlin.jvm.internal.u.e(aVar, u3.f93149a)) {
            return C1987R.drawable.icon_medium_activity_soccer;
        }
        if (kotlin.jvm.internal.u.e(aVar, v3.f93164a)) {
            return C1987R.drawable.icon_medium_activity_squash;
        }
        if (kotlin.jvm.internal.u.e(aVar, w3.f93179a)) {
            return C1987R.drawable.icon_medium_activity_standingframe;
        }
        if (kotlin.jvm.internal.u.e(aVar, x3.f93194a)) {
            return C1987R.drawable.icon_medium_activity_surfing;
        }
        if (kotlin.jvm.internal.u.e(aVar, y3.f93209a)) {
            return C1987R.drawable.icon_medium_activity_swim;
        }
        if (kotlin.jvm.internal.u.e(aVar, z3.f93224a)) {
            return C1987R.drawable.icon_medium_activity_taekwondo;
        }
        if (kotlin.jvm.internal.u.e(aVar, a4.f92840a)) {
            return C1987R.drawable.icon_medium_activity_tennis;
        }
        if (kotlin.jvm.internal.u.e(aVar, b4.f92856a)) {
            return C1987R.drawable.icon_medium_activity_teqball;
        }
        if (kotlin.jvm.internal.u.e(aVar, c4.f92872a)) {
            return C1987R.drawable.icon_medium_activity_trampoline;
        }
        if (kotlin.jvm.internal.u.e(aVar, d4.f92888a)) {
            return C1987R.drawable.icon_medium_activity_triathlon;
        }
        if (kotlin.jvm.internal.u.e(aVar, e4.f92904a)) {
            return C1987R.drawable.icon_medium_activity_ultimate;
        }
        if (kotlin.jvm.internal.u.e(aVar, f4.f92920a)) {
            return C1987R.drawable.icon_medium_activity_volley;
        }
        if (kotlin.jvm.internal.u.e(aVar, g4.f92936a)) {
            return C1987R.drawable.icon_medium_activity_walk;
        }
        if (kotlin.jvm.internal.u.e(aVar, h4.f92952a)) {
            return C1987R.drawable.icon_medium_activity_walkwithcane;
        }
        if (kotlin.jvm.internal.u.e(aVar, i4.f92968a)) {
            return C1987R.drawable.icon_medium_activity_walkwithwalker;
        }
        if (kotlin.jvm.internal.u.e(aVar, j4.f92984a)) {
            return C1987R.drawable.icon_medium_activity_waterpolo;
        }
        if (kotlin.jvm.internal.u.e(aVar, k4.f93000a)) {
            return C1987R.drawable.icon_medium_activity_weightlifting;
        }
        if (kotlin.jvm.internal.u.e(aVar, l4.f93015a)) {
            return C1987R.drawable.icon_medium_activity_wheelchairpushrunningpace;
        }
        if (kotlin.jvm.internal.u.e(aVar, m4.f93030a)) {
            return C1987R.drawable.icon_medium_activity_wheelchairpushwalkingpace;
        }
        if (kotlin.jvm.internal.u.e(aVar, n4.f93045a)) {
            return C1987R.drawable.icon_medium_activity_windsurf;
        }
        if (kotlin.jvm.internal.u.e(aVar, o4.f93060a)) {
            return C1987R.drawable.icon_medium_activity_wrestling;
        }
        if (kotlin.jvm.internal.u.e(aVar, p4.f93075a)) {
            return C1987R.drawable.icon_medium_activity_yoga;
        }
        if (kotlin.jvm.internal.u.e(aVar, q4.f93090a)) {
            return C1987R.drawable.icon_medium_activity_zumba;
        }
        if (kotlin.jvm.internal.u.e(aVar, r4.f93105a)) {
            return C1987R.drawable.icon_medium_anatomical_abdomen;
        }
        if (kotlin.jvm.internal.u.e(aVar, s4.f93120a)) {
            return C1987R.drawable.icon_medium_anatomical_artery;
        }
        if (kotlin.jvm.internal.u.e(aVar, t4.f93135a)) {
            return C1987R.drawable.icon_medium_anatomical_baby;
        }
        if (kotlin.jvm.internal.u.e(aVar, u4.f93150a)) {
            return C1987R.drawable.icon_medium_anatomical_back;
        }
        if (kotlin.jvm.internal.u.e(aVar, v4.f93165a)) {
            return C1987R.drawable.icon_medium_anatomical_bone;
        }
        if (kotlin.jvm.internal.u.e(aVar, w4.f93180a)) {
            return C1987R.drawable.icon_medium_anatomical_breast;
        }
        if (kotlin.jvm.internal.u.e(aVar, x4.f93195a)) {
            return C1987R.drawable.icon_medium_anatomical_breathing;
        }
        if (kotlin.jvm.internal.u.e(aVar, y4.f93210a)) {
            return C1987R.drawable.icon_medium_anatomical_cervical_aqueous;
        }
        if (kotlin.jvm.internal.u.e(aVar, z4.f93225a)) {
            return C1987R.drawable.icon_medium_anatomical_cervical_creamy;
        }
        if (kotlin.jvm.internal.u.e(aVar, a5.f92841a)) {
            return C1987R.drawable.icon_medium_anatomical_cervical_eggwhite;
        }
        if (kotlin.jvm.internal.u.e(aVar, b5.f92857a)) {
            return C1987R.drawable.icon_medium_anatomical_cervical_nodischarge;
        }
        if (kotlin.jvm.internal.u.e(aVar, c5.f92873a)) {
            return C1987R.drawable.icon_medium_anatomical_cervical_spotting;
        }
        if (kotlin.jvm.internal.u.e(aVar, d5.f92889a)) {
            return C1987R.drawable.icon_medium_anatomical_cervical_viscous;
        }
        if (kotlin.jvm.internal.u.e(aVar, e5.f92905a)) {
            return C1987R.drawable.icon_medium_anatomical_chest;
        }
        if (kotlin.jvm.internal.u.e(aVar, f5.f92921a)) {
            return C1987R.drawable.icon_medium_anatomical_drop;
        }
        if (kotlin.jvm.internal.u.e(aVar, g5.f92937a)) {
            return C1987R.drawable.icon_medium_anatomical_ecg;
        }
        if (kotlin.jvm.internal.u.e(aVar, h5.f92953a)) {
            return C1987R.drawable.icon_medium_anatomical_eye;
        }
        if (kotlin.jvm.internal.u.e(aVar, i5.f92969a)) {
            return C1987R.drawable.icon_medium_anatomical_eyeclosed1;
        }
        if (kotlin.jvm.internal.u.e(aVar, j5.f92985a)) {
            return C1987R.drawable.icon_medium_anatomical_eyeclosed2;
        }
        if (kotlin.jvm.internal.u.e(aVar, k5.f93001a)) {
            return C1987R.drawable.icon_medium_anatomical_fat;
        }
        if (kotlin.jvm.internal.u.e(aVar, l5.f93016a)) {
            return C1987R.drawable.icon_medium_anatomical_flame;
        }
        if (kotlin.jvm.internal.u.e(aVar, m5.f93031a)) {
            return C1987R.drawable.icon_medium_anatomical_flash;
        }
        if (kotlin.jvm.internal.u.e(aVar, n5.f93046a)) {
            return C1987R.drawable.icon_medium_anatomical_group;
        }
        if (kotlin.jvm.internal.u.e(aVar, o5.f93061a)) {
            return C1987R.drawable.icon_medium_anatomical_hand;
        }
        if (kotlin.jvm.internal.u.e(aVar, p5.f93076a)) {
            return C1987R.drawable.icon_medium_anatomical_head;
        }
        if (kotlin.jvm.internal.u.e(aVar, q5.f93091a)) {
            return C1987R.drawable.icon_medium_anatomical_heart;
        }
        if (kotlin.jvm.internal.u.e(aVar, r5.f93106a)) {
            return C1987R.drawable.icon_medium_anatomical_highlibido;
        }
        if (kotlin.jvm.internal.u.e(aVar, s5.f93121a)) {
            return C1987R.drawable.icon_medium_anatomical_lowlibido;
        }
        if (kotlin.jvm.internal.u.e(aVar, t5.f93136a)) {
            return C1987R.drawable.icon_medium_anatomical_muscle;
        }
        if (kotlin.jvm.internal.u.e(aVar, u5.f93151a)) {
            return C1987R.drawable.icon_medium_anatomical_nervehealth;
        }
        if (kotlin.jvm.internal.u.e(aVar, v5.f93166a)) {
            return C1987R.drawable.icon_medium_anatomical_sleepcycle;
        }
        if (kotlin.jvm.internal.u.e(aVar, w5.f93181a)) {
            return C1987R.drawable.icon_medium_anatomical_snoring;
        }
        if (kotlin.jvm.internal.u.e(aVar, x5.f93196a)) {
            return C1987R.drawable.icon_medium_anatomical_stomach;
        }
        if (kotlin.jvm.internal.u.e(aVar, y5.f93211a)) {
            return C1987R.drawable.icon_medium_anatomical_symptoms;
        }
        if (kotlin.jvm.internal.u.e(aVar, z5.f93226a)) {
            return C1987R.drawable.icon_medium_category_activity;
        }
        if (kotlin.jvm.internal.u.e(aVar, a6.f92842a)) {
            return C1987R.drawable.icon_medium_category_body;
        }
        if (kotlin.jvm.internal.u.e(aVar, b6.f92858a)) {
            return C1987R.drawable.icon_medium_category_devices;
        }
        if (kotlin.jvm.internal.u.e(aVar, c6.f92874a)) {
            return C1987R.drawable.icon_medium_category_heart;
        }
        if (kotlin.jvm.internal.u.e(aVar, d6.f92890a)) {
            return C1987R.drawable.icon_medium_category_mindfulness;
        }
        if (kotlin.jvm.internal.u.e(aVar, e6.f92906a)) {
            return C1987R.drawable.icon_medium_category_moon;
        }
        if (kotlin.jvm.internal.u.e(aVar, f6.f92922a)) {
            return C1987R.drawable.icon_medium_category_nutrition;
        }
        if (kotlin.jvm.internal.u.e(aVar, g6.f92938a)) {
            return C1987R.drawable.icon_medium_category_respiratory;
        }
        if (kotlin.jvm.internal.u.e(aVar, h6.f92954a)) {
            return C1987R.drawable.icon_medium_category_sexualhealth;
        }
        if (kotlin.jvm.internal.u.e(aVar, i6.f92970a)) {
            return C1987R.drawable.icon_medium_category_sleep;
        }
        if (kotlin.jvm.internal.u.e(aVar, j6.f92986a)) {
            return C1987R.drawable.icon_medium_device_aura;
        }
        if (kotlin.jvm.internal.u.e(aVar, k6.f93002a)) {
            return C1987R.drawable.icon_medium_device_bodycardio;
        }
        if (kotlin.jvm.internal.u.e(aVar, l6.f93017a)) {
            return C1987R.drawable.icon_medium_device_bodyplustype;
        }
        if (kotlin.jvm.internal.u.e(aVar, m6.f93032a)) {
            return C1987R.drawable.icon_medium_device_bodyscan;
        }
        if (kotlin.jvm.internal.u.e(aVar, n6.f93047a)) {
            return C1987R.drawable.icon_medium_device_bodytype;
        }
        if (kotlin.jvm.internal.u.e(aVar, o6.f93062a)) {
            return C1987R.drawable.icon_medium_device_bpmconnect;
        }
        if (kotlin.jvm.internal.u.e(aVar, p6.f93077a)) {
            return C1987R.drawable.icon_medium_device_bpmcore;
        }
        if (kotlin.jvm.internal.u.e(aVar, q6.f93092a)) {
            return C1987R.drawable.icon_medium_device_comparebpm;
        }
        if (kotlin.jvm.internal.u.e(aVar, r6.f93107a)) {
            return C1987R.drawable.icon_medium_device_comparescales;
        }
        if (kotlin.jvm.internal.u.e(aVar, s6.f93122a)) {
            return C1987R.drawable.icon_medium_device_comparewatches;
        }
        if (kotlin.jvm.internal.u.e(aVar, t6.f93137a)) {
            return C1987R.drawable.icon_medium_device_datahub;
        }
        if (kotlin.jvm.internal.u.e(aVar, v6.f93167a)) {
            return C1987R.drawable.icon_medium_device_goscreen;
        }
        if (kotlin.jvm.internal.u.e(aVar, u6.f93152a)) {
            return C1987R.drawable.icon_medium_device_goscreen2;
        }
        if (kotlin.jvm.internal.u.e(aVar, w6.f93182a)) {
            return C1987R.drawable.icon_medium_device_home;
        }
        if (kotlin.jvm.internal.u.e(aVar, x6.f93197a)) {
            return C1987R.drawable.icon_medium_device_laptop;
        }
        if (kotlin.jvm.internal.u.e(aVar, y6.f93212a)) {
            return C1987R.drawable.icon_medium_device_move;
        }
        if (kotlin.jvm.internal.u.e(aVar, z6.f93227a)) {
            return C1987R.drawable.icon_medium_device_pulsehr;
        }
        if (kotlin.jvm.internal.u.e(aVar, a7.f92843a)) {
            return C1987R.drawable.icon_medium_device_scalehandle;
        }
        if (kotlin.jvm.internal.u.e(aVar, b7.f92859a)) {
            return C1987R.drawable.icon_medium_device_scanwatchtype;
        }
        if (kotlin.jvm.internal.u.e(aVar, c7.f92875a)) {
            return C1987R.drawable.icon_medium_device_sleepanalyzer;
        }
        if (kotlin.jvm.internal.u.e(aVar, d7.f92891a)) {
            return C1987R.drawable.icon_medium_device_thermo;
        }
        if (kotlin.jvm.internal.u.e(aVar, e7.f92907a)) {
            return C1987R.drawable.icon_medium_device_uscan;
        }
        if (kotlin.jvm.internal.u.e(aVar, g7.f92939a)) {
            return C1987R.drawable.icon_medium_device_whours;
        }
        if (kotlin.jvm.internal.u.e(aVar, f7.f92923a)) {
            return C1987R.drawable.icon_medium_device_whours2;
        }
        if (kotlin.jvm.internal.u.e(aVar, i7.f92971a)) {
            return C1987R.drawable.icon_medium_device_wminutes;
        }
        if (kotlin.jvm.internal.u.e(aVar, h7.f92955a)) {
            return C1987R.drawable.icon_medium_device_wminutes2;
        }
        if (kotlin.jvm.internal.u.e(aVar, k7.f93003a)) {
            return C1987R.drawable.icon_medium_device_wmotion;
        }
        if (kotlin.jvm.internal.u.e(aVar, j7.f92987a)) {
            return C1987R.drawable.icon_medium_device_wmotion2;
        }
        if (kotlin.jvm.internal.u.e(aVar, l7.f93018a)) {
            return C1987R.drawable.icon_medium_device_wmotionhr;
        }
        if (kotlin.jvm.internal.u.e(aVar, m7.f93033a)) {
            return C1987R.drawable.icon_medium_device_wristband;
        }
        if (kotlin.jvm.internal.u.e(aVar, n7.f93048a)) {
            return C1987R.drawable.icon_medium_equipment_barbell;
        }
        if (kotlin.jvm.internal.u.e(aVar, o7.f93063a)) {
            return C1987R.drawable.icon_medium_equipment_bench;
        }
        if (kotlin.jvm.internal.u.e(aVar, p7.f93078a)) {
            return C1987R.drawable.icon_medium_equipment_blanket;
        }
        if (kotlin.jvm.internal.u.e(aVar, q7.f93093a)) {
            return C1987R.drawable.icon_medium_equipment_broomstick;
        }
        if (kotlin.jvm.internal.u.e(aVar, r7.f93108a)) {
            return C1987R.drawable.icon_medium_equipment_chair;
        }
        if (kotlin.jvm.internal.u.e(aVar, s7.f93123a)) {
            return C1987R.drawable.icon_medium_equipment_contraception;
        }
        if (kotlin.jvm.internal.u.e(aVar, t7.f93138a)) {
            return C1987R.drawable.icon_medium_equipment_gripweight;
        }
        if (kotlin.jvm.internal.u.e(aVar, u7.f93153a)) {
            return C1987R.drawable.icon_medium_equipment_hightable;
        }
        if (kotlin.jvm.internal.u.e(aVar, v7.f93168a)) {
            return C1987R.drawable.icon_medium_equipment_jumpingrope;
        }
        if (kotlin.jvm.internal.u.e(aVar, w7.f93183a)) {
            return C1987R.drawable.icon_medium_equipment_mat;
        }
        if (kotlin.jvm.internal.u.e(aVar, x7.f93198a)) {
            return C1987R.drawable.icon_medium_equipment_nocontraception;
        }
        if (kotlin.jvm.internal.u.e(aVar, y7.f93213a)) {
            return C1987R.drawable.icon_medium_equipment_pullupbar;
        }
        if (kotlin.jvm.internal.u.e(aVar, z7.f93228a)) {
            return C1987R.drawable.icon_medium_equipment_pullupbardoor;
        }
        if (kotlin.jvm.internal.u.e(aVar, a8.f92844a)) {
            return C1987R.drawable.icon_medium_equipment_pulluprings;
        }
        if (kotlin.jvm.internal.u.e(aVar, b8.f92860a)) {
            return C1987R.drawable.icon_medium_equipment_resistancebands;
        }
        if (kotlin.jvm.internal.u.e(aVar, c8.f92876a)) {
            return C1987R.drawable.icon_medium_equipment_sportclothes;
        }
        if (kotlin.jvm.internal.u.e(aVar, d8.f92892a)) {
            return C1987R.drawable.icon_medium_equipment_stool;
        }
        if (kotlin.jvm.internal.u.e(aVar, e8.f92908a)) {
            return C1987R.drawable.icon_medium_equipment_sweattowel;
        }
        if (kotlin.jvm.internal.u.e(aVar, f8.f92924a)) {
            return C1987R.drawable.icon_medium_equipment_swissball;
        }
        if (kotlin.jvm.internal.u.e(aVar, g8.f92940a)) {
            return C1987R.drawable.icon_medium_equipment_towel;
        }
        if (kotlin.jvm.internal.u.e(aVar, h8.f92956a)) {
            return C1987R.drawable.icon_medium_equipment_wall;
        }
        if (kotlin.jvm.internal.u.e(aVar, i8.f92972a)) {
            return C1987R.drawable.icon_medium_equipment_waterbottle;
        }
        if (kotlin.jvm.internal.u.e(aVar, j8.f92988a)) {
            return C1987R.drawable.icon_medium_equipment_weight;
        }
        if (kotlin.jvm.internal.u.e(aVar, k8.f93004a)) {
            return C1987R.drawable.icon_medium_equipment_weightsdumbells;
        }
        if (kotlin.jvm.internal.u.e(aVar, l8.f93019a)) {
            return C1987R.drawable.icon_medium_equipment_yogablocks;
        }
        if (kotlin.jvm.internal.u.e(aVar, m8.f93034a)) {
            return C1987R.drawable.icon_medium_face_happy;
        }
        if (kotlin.jvm.internal.u.e(aVar, n8.f93049a)) {
            return C1987R.drawable.icon_medium_face_happymoderate;
        }
        if (kotlin.jvm.internal.u.e(aVar, o8.f93064a)) {
            return C1987R.drawable.icon_medium_face_needslove;
        }
        if (kotlin.jvm.internal.u.e(aVar, p8.f93079a)) {
            return C1987R.drawable.icon_medium_face_neutral;
        }
        if (kotlin.jvm.internal.u.e(aVar, q8.f93094a)) {
            return C1987R.drawable.icon_medium_face_sad;
        }
        if (kotlin.jvm.internal.u.e(aVar, r8.f93109a)) {
            return C1987R.drawable.icon_medium_face_sadmoderate;
        }
        if (kotlin.jvm.internal.u.e(aVar, s8.f93124a)) {
            return C1987R.drawable.icon_medium_feature_alarmclock;
        }
        if (kotlin.jvm.internal.u.e(aVar, t8.f93139a)) {
            return C1987R.drawable.icon_medium_feature_atm;
        }
        if (kotlin.jvm.internal.u.e(aVar, u8.f93154a)) {
            return C1987R.drawable.icon_medium_feature_badges;
        }
        if (kotlin.jvm.internal.u.e(aVar, v8.f93169a)) {
            return C1987R.drawable.icon_medium_feature_battery1;
        }
        if (kotlin.jvm.internal.u.e(aVar, w8.f93184a)) {
            return C1987R.drawable.icon_medium_feature_battery2;
        }
        if (kotlin.jvm.internal.u.e(aVar, x8.f93199a)) {
            return C1987R.drawable.icon_medium_feature_battery3;
        }
        if (kotlin.jvm.internal.u.e(aVar, y8.f93214a)) {
            return C1987R.drawable.icon_medium_feature_battery4;
        }
        if (kotlin.jvm.internal.u.e(aVar, z8.f93229a)) {
            return C1987R.drawable.icon_medium_feature_battery5;
        }
        if (kotlin.jvm.internal.u.e(aVar, a9.f92845a)) {
            return C1987R.drawable.icon_medium_feature_battery6;
        }
        if (kotlin.jvm.internal.u.e(aVar, b9.f92861a)) {
            return C1987R.drawable.icon_medium_feature_bezel;
        }
        if (kotlin.jvm.internal.u.e(aVar, c9.f92877a)) {
            return C1987R.drawable.icon_medium_feature_bluetooth;
        }
        if (kotlin.jvm.internal.u.e(aVar, d9.f92893a)) {
            return C1987R.drawable.icon_medium_feature_book;
        }
        if (kotlin.jvm.internal.u.e(aVar, e9.f92909a)) {
            return C1987R.drawable.icon_medium_feature_cal;
        }
        if (kotlin.jvm.internal.u.e(aVar, f9.f92925a)) {
            return C1987R.drawable.icon_medium_feature_calendar;
        }
        if (kotlin.jvm.internal.u.e(aVar, g9.f92941a)) {
            return C1987R.drawable.icon_medium_feature_calendaradd;
        }
        if (kotlin.jvm.internal.u.e(aVar, h9.f92957a)) {
            return C1987R.drawable.icon_medium_feature_camera;
        }
        if (kotlin.jvm.internal.u.e(aVar, i9.f92973a)) {
            return C1987R.drawable.icon_medium_feature_cellular;
        }
        if (kotlin.jvm.internal.u.e(aVar, j9.f92989a)) {
            return C1987R.drawable.icon_medium_feature_clock;
        }
        if (kotlin.jvm.internal.u.e(aVar, k9.f93005a)) {
            return C1987R.drawable.icon_medium_feature_cloud;
        }
        if (kotlin.jvm.internal.u.e(aVar, l9.f93020a)) {
            return C1987R.drawable.icon_medium_feature_colorcodedresults;
        }
        if (kotlin.jvm.internal.u.e(aVar, m9.f93035a)) {
            return C1987R.drawable.icon_medium_feature_colorscreen;
        }
        if (kotlin.jvm.internal.u.e(aVar, n9.f93050a)) {
            return C1987R.drawable.icon_medium_feature_data;
        }
        if (kotlin.jvm.internal.u.e(aVar, o9.f93065a)) {
            return C1987R.drawable.icon_medium_feature_dollar;
        }
        if (kotlin.jvm.internal.u.e(aVar, p9.f93080a)) {
            return C1987R.drawable.icon_medium_feature_elevation;
        }
        if (kotlin.jvm.internal.u.e(aVar, q9.f93095a)) {
            return C1987R.drawable.icon_medium_feature_endphonecall;
        }
        if (kotlin.jvm.internal.u.e(aVar, r9.f93110a)) {
            return C1987R.drawable.icon_medium_feature_firstaidkit;
        }
        if (kotlin.jvm.internal.u.e(aVar, s9.f93125a)) {
            return C1987R.drawable.icon_medium_feature_flash;
        }
        if (kotlin.jvm.internal.u.e(aVar, t9.f93140a)) {
            return C1987R.drawable.icon_medium_feature_gauge;
        }
        if (kotlin.jvm.internal.u.e(aVar, u9.f93155a)) {
            return C1987R.drawable.icon_medium_feature_glass;
        }
        if (kotlin.jvm.internal.u.e(aVar, v9.f93170a)) {
            return C1987R.drawable.icon_medium_feature_help;
        }
        if (kotlin.jvm.internal.u.e(aVar, w9.f93185a)) {
            return C1987R.drawable.icon_medium_feature_his;
        }
        if (kotlin.jvm.internal.u.e(aVar, x9.f93200a)) {
            return C1987R.drawable.icon_medium_feature_info;
        }
        if (kotlin.jvm.internal.u.e(aVar, y9.f93215a)) {
            return C1987R.drawable.icon_medium_feature_leaderboard;
        }
        if (kotlin.jvm.internal.u.e(aVar, z9.f93230a)) {
            return C1987R.drawable.icon_medium_feature_location;
        }
        if (kotlin.jvm.internal.u.e(aVar, aa.f92846a)) {
            return C1987R.drawable.icon_medium_feature_lock;
        }
        if (kotlin.jvm.internal.u.e(aVar, ba.f92862a)) {
            return C1987R.drawable.icon_medium_feature_luminova;
        }
        if (kotlin.jvm.internal.u.e(aVar, ca.f92878a)) {
            return C1987R.drawable.icon_medium_feature_medicalreport;
        }
        if (kotlin.jvm.internal.u.e(aVar, da.f92894a)) {
            return C1987R.drawable.icon_medium_feature_mic;
        }
        if (kotlin.jvm.internal.u.e(aVar, ea.f92910a)) {
            return C1987R.drawable.icon_medium_feature_micoff;
        }
        if (kotlin.jvm.internal.u.e(aVar, fa.f92926a)) {
            return C1987R.drawable.icon_medium_feature_news;
        }
        if (kotlin.jvm.internal.u.e(aVar, ga.f92942a)) {
            return C1987R.drawable.icon_medium_feature_noflash;
        }
        if (kotlin.jvm.internal.u.e(aVar, ha.f92958a)) {
            return C1987R.drawable.icon_medium_feature_notification;
        }
        if (kotlin.jvm.internal.u.e(aVar, ia.f92974a)) {
            return C1987R.drawable.icon_medium_feature_paperclip;
        }
        if (kotlin.jvm.internal.u.e(aVar, ja.f92990a)) {
            return C1987R.drawable.icon_medium_feature_partnership;
        }
        if (kotlin.jvm.internal.u.e(aVar, ka.f93006a)) {
            return C1987R.drawable.icon_medium_feature_phonecall;
        }
        if (kotlin.jvm.internal.u.e(aVar, la.f93021a)) {
            return C1987R.drawable.icon_medium_feature_photoalbum;
        }
        if (kotlin.jvm.internal.u.e(aVar, ma.f93036a)) {
            return C1987R.drawable.icon_medium_feature_pill;
        }
        if (kotlin.jvm.internal.u.e(aVar, na.f93051a)) {
            return C1987R.drawable.icon_medium_feature_precision;
        }
        if (kotlin.jvm.internal.u.e(aVar, oa.f93066a)) {
            return C1987R.drawable.icon_medium_feature_probtpservice;
        }
        if (kotlin.jvm.internal.u.e(aVar, pa.f93081a)) {
            return C1987R.drawable.icon_medium_feature_qrcode;
        }
        if (kotlin.jvm.internal.u.e(aVar, qa.f93096a)) {
            return C1987R.drawable.icon_medium_feature_score;
        }
        if (kotlin.jvm.internal.u.e(aVar, ra.f93111a)) {
            return C1987R.drawable.icon_medium_feature_shipping;
        }
        if (kotlin.jvm.internal.u.e(aVar, sa.f93126a)) {
            return C1987R.drawable.icon_medium_feature_spark;
        }
        if (kotlin.jvm.internal.u.e(aVar, ta.f93141a)) {
            return C1987R.drawable.icon_medium_feature_stethoscope;
        }
        if (kotlin.jvm.internal.u.e(aVar, ua.f93156a)) {
            return C1987R.drawable.icon_medium_feature_stopwatch;
        }
        if (kotlin.jvm.internal.u.e(aVar, va.f93171a)) {
            return C1987R.drawable.icon_medium_feature_temperature;
        }
        if (kotlin.jvm.internal.u.e(aVar, wa.f93186a)) {
            return C1987R.drawable.icon_medium_feature_thumbsdown;
        }
        if (kotlin.jvm.internal.u.e(aVar, xa.f93201a)) {
            return C1987R.drawable.icon_medium_feature_thumbsup;
        }
        if (kotlin.jvm.internal.u.e(aVar, ya.f93216a)) {
            return C1987R.drawable.icon_medium_feature_time;
        }
        if (kotlin.jvm.internal.u.e(aVar, za.f93231a)) {
            return C1987R.drawable.icon_medium_feature_trend;
        }
        if (kotlin.jvm.internal.u.e(aVar, ab.f92847a)) {
            return C1987R.drawable.icon_medium_feature_trial30d;
        }
        if (kotlin.jvm.internal.u.e(aVar, bb.f92863a)) {
            return C1987R.drawable.icon_medium_feature_userrecognition;
        }
        if (kotlin.jvm.internal.u.e(aVar, cb.f92879a)) {
            return C1987R.drawable.icon_medium_feature_warranty2y;
        }
        if (kotlin.jvm.internal.u.e(aVar, db.f92895a)) {
            return C1987R.drawable.icon_medium_feature_warranty5y;
        }
        if (kotlin.jvm.internal.u.e(aVar, eb.f92911a)) {
            return C1987R.drawable.icon_medium_feature_weather;
        }
        if (kotlin.jvm.internal.u.e(aVar, fb.f92927a)) {
            return C1987R.drawable.icon_medium_feature_withingsplus;
        }
        if (kotlin.jvm.internal.u.e(aVar, gb.f92943a)) {
            return C1987R.drawable.icon_medium_interaction_intdrag1;
        }
        if (kotlin.jvm.internal.u.e(aVar, hb.f92959a)) {
            return C1987R.drawable.icon_medium_interaction_intdrag2;
        }
        if (kotlin.jvm.internal.u.e(aVar, ib.f92975a)) {
            return C1987R.drawable.icon_medium_interaction_intdrag3;
        }
        if (kotlin.jvm.internal.u.e(aVar, kb.f93007a)) {
            return C1987R.drawable.icon_medium_interaction_introtate;
        }
        if (kotlin.jvm.internal.u.e(aVar, jb.f92991a)) {
            return C1987R.drawable.icon_medium_interaction_introtate2;
        }
        if (kotlin.jvm.internal.u.e(aVar, lb.f93022a)) {
            return C1987R.drawable.icon_medium_interaction_intswipe;
        }
        if (kotlin.jvm.internal.u.e(aVar, mb.f93037a)) {
            return C1987R.drawable.icon_medium_interaction_intswipeleft;
        }
        if (kotlin.jvm.internal.u.e(aVar, nb.f93052a)) {
            return C1987R.drawable.icon_medium_interaction_intswiperight;
        }
        if (kotlin.jvm.internal.u.e(aVar, ob.f93067a)) {
            return C1987R.drawable.icon_medium_interaction_intzoom;
        }
        if (kotlin.jvm.internal.u.e(aVar, pb.f93082a)) {
            return C1987R.drawable.icon_medium_interaction_phonerotate;
        }
        if (kotlin.jvm.internal.u.e(aVar, qb.f93097a)) {
            return C1987R.drawable.icon_medium_navigation_achieve;
        }
        if (kotlin.jvm.internal.u.e(aVar, rb.f93112a)) {
            return C1987R.drawable.icon_medium_navigation_back;
        }
        if (kotlin.jvm.internal.u.e(aVar, sb.f93127a)) {
            return C1987R.drawable.icon_medium_navigation_backandroid;
        }
        if (kotlin.jvm.internal.u.e(aVar, tb.f93142a)) {
            return C1987R.drawable.icon_medium_navigation_basket;
        }
        if (kotlin.jvm.internal.u.e(aVar, ub.f93157a)) {
            return C1987R.drawable.icon_medium_navigation_bell;
        }
        if (kotlin.jvm.internal.u.e(aVar, vb.f93172a)) {
            return C1987R.drawable.icon_medium_navigation_belldot;
        }
        if (kotlin.jvm.internal.u.e(aVar, wb.f93187a)) {
            return C1987R.drawable.icon_medium_navigation_close;
        }
        if (kotlin.jvm.internal.u.e(aVar, xb.f93202a)) {
            return C1987R.drawable.icon_medium_navigation_copy;
        }
        if (kotlin.jvm.internal.u.e(aVar, yb.f93217a)) {
            return C1987R.drawable.icon_medium_navigation_devices;
        }
        if (kotlin.jvm.internal.u.e(aVar, zb.f93232a)) {
            return C1987R.drawable.icon_medium_navigation_downsm;
        }
        if (kotlin.jvm.internal.u.e(aVar, ac.f92848a)) {
            return C1987R.drawable.icon_medium_navigation_edit;
        }
        if (kotlin.jvm.internal.u.e(aVar, bc.f92864a)) {
            return C1987R.drawable.icon_medium_navigation_export;
        }
        if (kotlin.jvm.internal.u.e(aVar, cc.f92880a)) {
            return C1987R.drawable.icon_medium_navigation_grip;
        }
        if (kotlin.jvm.internal.u.e(aVar, dc.f92896a)) {
            return C1987R.drawable.icon_medium_navigation_heart;
        }
        if (kotlin.jvm.internal.u.e(aVar, ec.f92912a)) {
            return C1987R.drawable.icon_medium_navigation_home;
        }
        if (kotlin.jvm.internal.u.e(aVar, fc.f92928a)) {
            return C1987R.drawable.icon_medium_navigation_inbox;
        }
        if (kotlin.jvm.internal.u.e(aVar, gc.f92944a)) {
            return C1987R.drawable.icon_medium_navigation_key;
        }
        if (kotlin.jvm.internal.u.e(aVar, hc.f92960a)) {
            return C1987R.drawable.icon_medium_navigation_leftright;
        }
        if (kotlin.jvm.internal.u.e(aVar, ic.f92976a)) {
            return C1987R.drawable.icon_medium_navigation_leftsm;
        }
        if (kotlin.jvm.internal.u.e(aVar, jc.f92992a)) {
            return C1987R.drawable.icon_medium_navigation_list;
        }
        if (kotlin.jvm.internal.u.e(aVar, kc.f93008a)) {
            return C1987R.drawable.icon_medium_navigation_measure;
        }
        if (kotlin.jvm.internal.u.e(aVar, lc.f93023a)) {
            return C1987R.drawable.icon_medium_navigation_menu;
        }
        if (kotlin.jvm.internal.u.e(aVar, mc.f93038a)) {
            return C1987R.drawable.icon_medium_navigation_minus;
        }
        if (kotlin.jvm.internal.u.e(aVar, nc.f93053a)) {
            return C1987R.drawable.icon_medium_navigation_more;
        }
        if (kotlin.jvm.internal.u.e(aVar, oc.f93068a)) {
            return C1987R.drawable.icon_medium_navigation_next;
        }
        if (kotlin.jvm.internal.u.e(aVar, pc.f93083a)) {
            return C1987R.drawable.icon_medium_navigation_nextarrow;
        }
        if (kotlin.jvm.internal.u.e(aVar, qc.f93098a)) {
            return C1987R.drawable.icon_medium_navigation_playerforward;
        }
        if (kotlin.jvm.internal.u.e(aVar, rc.f93113a)) {
            return C1987R.drawable.icon_medium_navigation_playerpause;
        }
        if (kotlin.jvm.internal.u.e(aVar, sc.f93128a)) {
            return C1987R.drawable.icon_medium_navigation_playerplay;
        }
        if (kotlin.jvm.internal.u.e(aVar, tc.f93143a)) {
            return C1987R.drawable.icon_medium_navigation_playerrewind;
        }
        if (kotlin.jvm.internal.u.e(aVar, uc.f93158a)) {
            return C1987R.drawable.icon_medium_navigation_playerskipnext;
        }
        if (kotlin.jvm.internal.u.e(aVar, vc.f93173a)) {
            return C1987R.drawable.icon_medium_navigation_playerskipprevious;
        }
        if (kotlin.jvm.internal.u.e(aVar, wc.f93188a)) {
            return C1987R.drawable.icon_medium_navigation_playerstop;
        }
        if (kotlin.jvm.internal.u.e(aVar, xc.f93203a)) {
            return C1987R.drawable.icon_medium_navigation_plus;
        }
        if (kotlin.jvm.internal.u.e(aVar, yc.f93218a)) {
            return C1987R.drawable.icon_medium_navigation_profile;
        }
        if (kotlin.jvm.internal.u.e(aVar, zc.f93233a)) {
            return C1987R.drawable.icon_medium_navigation_rightsm;
        }
        if (kotlin.jvm.internal.u.e(aVar, ad.f92849a)) {
            return C1987R.drawable.icon_medium_navigation_search;
        }
        if (kotlin.jvm.internal.u.e(aVar, bd.f92865a)) {
            return C1987R.drawable.icon_medium_navigation_settings;
        }
        if (kotlin.jvm.internal.u.e(aVar, cd.f92881a)) {
            return C1987R.drawable.icon_medium_navigation_share;
        }
        if (kotlin.jvm.internal.u.e(aVar, dd.f92897a)) {
            return C1987R.drawable.icon_medium_navigation_sync;
        }
        if (kotlin.jvm.internal.u.e(aVar, ed.f92913a)) {
            return C1987R.drawable.icon_medium_navigation_updown;
        }
        if (kotlin.jvm.internal.u.e(aVar, fd.f92929a)) {
            return C1987R.drawable.icon_medium_navigation_upsm;
        }
        if (kotlin.jvm.internal.u.e(aVar, gd.f92945a)) {
            return C1987R.drawable.icon_medium_navigation_voldown;
        }
        if (kotlin.jvm.internal.u.e(aVar, hd.f92961a)) {
            return C1987R.drawable.icon_medium_navigation_volup;
        }
        if (kotlin.jvm.internal.u.e(aVar, id.f92977a)) {
            return C1987R.drawable.icon_medium_navigation_wifilvl0;
        }
        if (kotlin.jvm.internal.u.e(aVar, jd.f92993a)) {
            return C1987R.drawable.icon_medium_navigation_wifilvl1;
        }
        if (kotlin.jvm.internal.u.e(aVar, kd.f93009a)) {
            return C1987R.drawable.icon_medium_navigation_wifilvl2;
        }
        if (kotlin.jvm.internal.u.e(aVar, ld.f93024a)) {
            return C1987R.drawable.icon_medium_navigation_wifilvl3;
        }
        if (kotlin.jvm.internal.u.e(aVar, md.f93039a)) {
            return C1987R.drawable.icon_medium_navigation_wifilvl4;
        }
        if (kotlin.jvm.internal.u.e(aVar, nd.f93054a)) {
            return C1987R.drawable.icon_medium_navigation_zoom;
        }
        if (kotlin.jvm.internal.u.e(aVar, od.f93069a)) {
            return C1987R.drawable.icon_medium_navigation_zoomout;
        }
        if (kotlin.jvm.internal.u.e(aVar, pd.f93084a)) {
            return C1987R.drawable.icon_medium_rounded_bulletpoint;
        }
        if (kotlin.jvm.internal.u.e(aVar, qd.f93099a)) {
            return C1987R.drawable.icon_medium_rounded_empty;
        }
        if (kotlin.jvm.internal.u.e(aVar, rd.f93114a)) {
            return C1987R.drawable.icon_medium_status_bad;
        }
        if (kotlin.jvm.internal.u.e(aVar, sd.f93129a)) {
            return C1987R.drawable.icon_medium_status_good;
        }
        if (kotlin.jvm.internal.u.e(aVar, td.f93144a)) {
            return C1987R.drawable.icon_medium_status_moderate;
        }
        if (kotlin.jvm.internal.u.e(aVar, ud.f93159a)) {
            return C1987R.drawable.icon_medium_status_trenddown;
        }
        if (kotlin.jvm.internal.u.e(aVar, vd.f93174a)) {
            return C1987R.drawable.icon_medium_status_trendstable;
        }
        if (kotlin.jvm.internal.u.e(aVar, wd.f93189a)) {
            return C1987R.drawable.icon_medium_status_trendup;
        }
        if (kotlin.jvm.internal.u.e(aVar, xd.f93204a)) {
            return C1987R.drawable.icon_medium_status_undefined;
        }
        if (kotlin.jvm.internal.u.e(aVar, yd.f93219a)) {
            return C1987R.drawable.icon_medium_stock_bookmark;
        }
        if (kotlin.jvm.internal.u.e(aVar, zd.f93234a)) {
            return C1987R.drawable.icon_medium_stock_bookmarkfilled;
        }
        if (kotlin.jvm.internal.u.e(aVar, ae.f92850a)) {
            return C1987R.drawable.icon_small_category_activity;
        }
        if (kotlin.jvm.internal.u.e(aVar, be.f92866a)) {
            return C1987R.drawable.icon_small_category_body;
        }
        if (kotlin.jvm.internal.u.e(aVar, ce.f92882a)) {
            return C1987R.drawable.icon_small_category_broccoli;
        }
        if (kotlin.jvm.internal.u.e(aVar, de.f92898a)) {
            return C1987R.drawable.icon_small_category_food2;
        }
        if (kotlin.jvm.internal.u.e(aVar, ee.f92914a)) {
            return C1987R.drawable.icon_small_category_heart;
        }
        if (kotlin.jvm.internal.u.e(aVar, fe.f92930a)) {
            return C1987R.drawable.icon_small_category_mindfulness;
        }
        if (kotlin.jvm.internal.u.e(aVar, ge.f92946a)) {
            return C1987R.drawable.icon_small_category_nutrition;
        }
        if (kotlin.jvm.internal.u.e(aVar, he.f92962a)) {
            return C1987R.drawable.icon_small_category_respiratory;
        }
        if (kotlin.jvm.internal.u.e(aVar, ie.f92978a)) {
            return C1987R.drawable.icon_small_category_sexualhealth;
        }
        if (kotlin.jvm.internal.u.e(aVar, je.f92994a)) {
            return C1987R.drawable.icon_small_category_sleep;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Serializable H(Activity activity, String extra) {
        Serializable serializable;
        kotlin.jvm.internal.u.j(activity, "<this>");
        kotlin.jvm.internal.u.j(extra, "extra");
        Bundle extras = activity.getIntent().getExtras();
        Serializable serializable2 = null;
        if (extras != null) {
            serializable = extras.getSerializable(extra);
        } else {
            serializable = null;
        }
        if (serializable instanceof Serializable) {
            serializable2 = serializable;
        }
        if (serializable2 != null) {
            return serializable2;
        }
        throw new NullPointerException(String.format("extra %s not expected to be null", Arrays.copyOf(new Object[]{extra}, 1)));
    }

    public static final String I(Activity activity, String extra) {
        String str;
        kotlin.jvm.internal.u.j(activity, "<this>");
        kotlin.jvm.internal.u.j(extra, "extra");
        Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            str = extras.getString(extra);
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        throw new NullPointerException(String.format("extra %s not expected to be null", Arrays.copyOf(new Object[]{extra}, 1)));
    }

    public static final boolean J(LocalDate startDate, LocalDate endDate) {
        kotlin.jvm.internal.u.j(startDate, "startDate");
        kotlin.jvm.internal.u.j(endDate, "endDate");
        if (Math.abs(Days.daysBetween(startDate, endDate).getDays()) >= 6) {
            return true;
        }
        return false;
    }

    public static final boolean K(kotlin.reflect.jvm.internal.impl.types.f0 f0Var) {
        kotlin.jvm.internal.u.j(f0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.types.s1 K0 = f0Var.K0();
        if (!(K0 instanceof uo0.f) && (!(K0 instanceof kotlin.reflect.jvm.internal.impl.types.z) || !(((kotlin.reflect.jvm.internal.impl.types.z) K0).O0() instanceof uo0.f))) {
            return false;
        }
        return true;
    }

    private static final boolean L(kotlin.reflect.jvm.internal.impl.types.f0 f0Var) {
        nn0.o0 o0Var;
        nn0.d j5 = f0Var.H0().j();
        if (j5 instanceof nn0.o0) {
            o0Var = (nn0.o0) j5;
        } else {
            o0Var = null;
        }
        if (o0Var == null) {
            return false;
        }
        return R(xo0.a.i(o0Var));
    }

    public static final double M(nz.c cVar) {
        kotlin.jvm.internal.u.j(cVar, "<this>");
        return Math.max(cVar.c().c().doubleValue(), cVar.c().d().doubleValue());
    }

    public static final double N(nz.c cVar) {
        kotlin.jvm.internal.u.j(cVar, "<this>");
        return Math.min(cVar.c().c().doubleValue(), cVar.c().d().doubleValue());
    }

    public static void O(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j5 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Animator animator = (Animator) arrayList.get(i11);
            j5 = Math.max(j5, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j5);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final Camera P(View view) {
        kotlin.jvm.internal.u.j(view, "<this>");
        Camera camera = view.getCamera();
        if (camera != null) {
            return camera;
        }
        throw new IllegalStateException("No camera have been setting up.");
    }

    public static final Scene Q(View view) {
        kotlin.jvm.internal.u.j(view, "<this>");
        Scene scene = view.getScene();
        if (scene != null) {
            return scene;
        }
        throw new IllegalStateException("No scene have been setting up.");
    }

    private static final boolean R(kotlin.reflect.jvm.internal.impl.types.f0 f0Var) {
        nn0.d j5 = f0Var.H0().j();
        if ((j5 != null && io0.e.b(j5) && !kotlin.jvm.internal.u.e(lo0.c.g((nn0.b) j5), ln0.m.f79999g)) || L(f0Var)) {
            return true;
        }
        return false;
    }

    public static final void S(int i11, int i12, Object[] objArr) {
        kotlin.jvm.internal.u.j(objArr, "<this>");
        while (i11 < i12) {
            objArr[i11] = null;
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int T(ArrayList arrayList, int i11, int i12) {
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            int a11 = ((k1.c) arrayList.get(i14)).a();
            if (a11 < 0) {
                a11 += i12;
            }
            int l5 = kotlin.jvm.internal.u.l(a11, i11);
            if (l5 < 0) {
                i13 = i14 + 1;
            } else if (l5 > 0) {
                size = i14 - 1;
            } else {
                return i14;
            }
        }
        return -(i13 + 1);
    }

    private static final Object U(Set set, Enum r22, Enum r32, Object obj, boolean z5) {
        Enum r12;
        if (z5) {
            if (set.contains(r22)) {
                r12 = r22;
            } else if (set.contains(r32)) {
                r12 = r32;
            } else {
                r12 = null;
            }
            if (kotlin.jvm.internal.u.e(r12, r22) && kotlin.jvm.internal.u.e(obj, r32)) {
                return null;
            }
            if (obj == null) {
                return r12;
            }
            return obj;
        }
        if (obj != null) {
            set = kotlin.collections.x.U0(kotlin.collections.c1.f(set, obj));
        }
        return kotlin.collections.x.x0(set);
    }

    public static final void V(py.a aVar, Period period, DateTime dateTime) {
        kotlin.jvm.internal.u.j(aVar, "<this>");
        kotlin.jvm.internal.u.j(period, "period");
        kotlin.jvm.internal.u.j(dateTime, "dateTime");
        DateTime withTimeAtStartOfDay = dateTime.withTimeAtStartOfDay();
        switch (period.ordinal()) {
            case 1:
                String b10 = period.b();
                if (b10 != null) {
                    W(aVar, b10, String.valueOf(withTimeAtStartOfDay.getMillis()));
                    return;
                }
                return;
            case 2:
                String b11 = period.b();
                if (b11 != null) {
                    kotlin.jvm.internal.u.g(withTimeAtStartOfDay);
                    String lowerCase = b11.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.u.i(lowerCase, "toLowerCase(...)");
                    int abs = Math.abs(Days.daysBetween(withTimeAtStartOfDay, DateTime.now()).getDays());
                    W(aVar, b11, lowerCase + "-" + abs);
                    return;
                }
                return;
            case 3:
                String b12 = period.b();
                if (b12 != null) {
                    kotlin.jvm.internal.u.g(withTimeAtStartOfDay);
                    int abs2 = Math.abs(Weeks.weeksBetween(DateTime.now().dayOfWeek().withMinimumValue(), withTimeAtStartOfDay.dayOfWeek().withMinimumValue()).getWeeks());
                    String lowerCase2 = b12.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.u.i(lowerCase2, "toLowerCase(...)");
                    W(aVar, b12, lowerCase2 + "-" + abs2);
                    return;
                }
                return;
            case 4:
                String b13 = period.b();
                if (b13 != null) {
                    kotlin.jvm.internal.u.g(withTimeAtStartOfDay);
                    int abs3 = Math.abs(Months.monthsBetween(DateTime.now().dayOfMonth().withMinimumValue(), withTimeAtStartOfDay.dayOfMonth().withMinimumValue()).getMonths());
                    String lowerCase3 = b13.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.u.i(lowerCase3, "toLowerCase(...)");
                    W(aVar, b13, lowerCase3 + "-" + abs3);
                    return;
                }
                return;
            case 5:
                String b14 = period.b();
                if (b14 != null) {
                    kotlin.jvm.internal.u.g(withTimeAtStartOfDay);
                    W(aVar, b14, py.b.a(b14, withTimeAtStartOfDay));
                    return;
                }
                return;
            case 6:
                String b15 = period.b();
                if (b15 != null) {
                    kotlin.jvm.internal.u.g(withTimeAtStartOfDay);
                    int abs4 = Math.abs(Years.yearsBetween(DateTime.now().dayOfYear().withMinimumValue(), withTimeAtStartOfDay.dayOfYear().withMinimumValue()).getYears());
                    String lowerCase4 = b15.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.u.i(lowerCase4, "toLowerCase(...)");
                    W(aVar, b15, lowerCase4 + "-" + abs4);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private static final void W(py.a aVar, String str, String str2) {
        String analyticsDetailsViewIdentifier = aVar.getAnalyticsDetailsViewIdentifier();
        if (analyticsDetailsViewIdentifier != null) {
            String concat = "detail_view_".concat(analyticsDetailsViewIdentifier);
            String lowerCase = str.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.u.i(lowerCase, "toLowerCase(...)");
            v70.a.c(concat, kotlin.collections.s0.j(new nm0.j("time_aggregate", lowerCase), new nm0.j("window_date", str2)), 2);
        }
    }

    public static final boolean X(CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.b bVar;
        if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
            bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) callableMemberDescriptor;
        } else {
            bVar = null;
        }
        if (bVar == null || nn0.l.g(bVar.getVisibility())) {
            return false;
        }
        nn0.b U = bVar.U();
        kotlin.jvm.internal.u.i(U, "constructorDescriptor.constructedClass");
        if (io0.e.b(U) || io0.d.B(bVar.U())) {
            return false;
        }
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> e11 = bVar.e();
        kotlin.jvm.internal.u.i(e11, "constructorDescriptor.valueParameters");
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> list = e11;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.h hVar : list) {
            kotlin.reflect.jvm.internal.impl.types.f0 type = hVar.getType();
            kotlin.jvm.internal.u.i(type, "it.type");
            if (R(type)) {
                return true;
            }
        }
        return false;
    }

    public static final void Y(nl0.a aVar, int i11) {
        kotlin.jvm.internal.u.j(null, "<this>");
        ol0.b.c(null, 1, null);
        throw null;
    }

    public static final void Z(nl0.c cVar, byte[] src, int i11, int i12) {
        kotlin.jvm.internal.u.j(cVar, "<this>");
        kotlin.jvm.internal.u.j(src, "src");
        ol0.a c11 = ol0.b.c(cVar, 1, null);
        while (true) {
            try {
                int min = Math.min(i12, c11.g() - c11.k());
                ah.k.x(c11, src, i11, min);
                i11 += min;
                i12 -= min;
                if (i12 > 0) {
                    c11 = ol0.b.c(cVar, 1, c11);
                } else {
                    return;
                }
            } finally {
                cVar.a();
            }
        }
    }

    public static final int a(int i11, int[] iArr) {
        int i12 = i11 * 5;
        if (i12 >= iArr.length) {
            return iArr.length;
        }
        return t(iArr[i12 + 1] >> 29) + iArr[i12 + 4];
    }

    public static final boolean b(int i11, int[] iArr) {
        if ((iArr[(i11 * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public static final int d(int i11, int[] iArr) {
        return iArr[(i11 * 5) + 4];
    }

    public static final k1.c e(ArrayList arrayList, int i11, int i12) {
        int T = T(arrayList, i11, i12);
        if (T >= 0) {
            return (k1.c) arrayList.get(T);
        }
        return null;
    }

    public static final int f(int i11, int[] iArr) {
        return iArr[(i11 * 5) + 3];
    }

    public static final boolean g(int i11, int[] iArr) {
        if ((iArr[(i11 * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean h(int i11, int[] iArr) {
        if ((iArr[(i11 * 5) + 1] & ConstantsWs.DEBUG_BITMASK_EXTENDED_HWA10_RAWDATA_CBTA) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean i(int i11, int[] iArr) {
        if ((iArr[(i11 * 5) + 1] & ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH) != 0) {
            return true;
        }
        return false;
    }

    public static final int j(ArrayList arrayList, int i11, int i12) {
        int T = T(arrayList, i11, i12);
        if (T < 0) {
            return -(T + 1);
        }
        return T;
    }

    public static final int k(int i11, int[] iArr) {
        return iArr[(i11 * 5) + 1] & 67108863;
    }

    public static final int l(int i11, int[] iArr) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + t(iArr[i12 + 1] >> 30);
    }

    public static final int m(int i11, int[] iArr) {
        return iArr[(i11 * 5) + 2];
    }

    public static final int o(int i11, int[] iArr) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + t(iArr[i12 + 1] >> 28);
    }

    public static final void p(int i11, int i12, int[] iArr) {
        boolean z5;
        if (i12 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        androidx.compose.runtime.h.u(z5);
        iArr[(i11 * 5) + 3] = i12;
    }

    public static final void q(int i11, int i12, int[] iArr) {
        boolean z5;
        if (i12 >= 0 && i12 < 67108863) {
            z5 = true;
        } else {
            z5 = false;
        }
        androidx.compose.runtime.h.u(z5);
        int i13 = (i11 * 5) + 1;
        iArr[i13] = i12 | (iArr[i13] & (-67108864));
    }

    public static final do0.g r(do0.g gVar, ArrayList arrayList, boolean z5, boolean z11, boolean z12) {
        NullabilityQualifier nullabilityQualifier;
        NullabilityQualifier d11;
        NullabilityQualifier nullabilityQualifier2;
        boolean z13;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            nullabilityQualifier = null;
            if (!it.hasNext()) {
                break;
            }
            do0.g gVar2 = (do0.g) it.next();
            if (!gVar2.e()) {
                nullabilityQualifier = gVar2.d();
            }
            if (nullabilityQualifier != null) {
                arrayList2.add(nullabilityQualifier);
            }
        }
        Set U0 = kotlin.collections.x.U0(arrayList2);
        if (gVar.e()) {
            d11 = null;
        } else {
            d11 = gVar.d();
        }
        NullabilityQualifier nullabilityQualifier3 = NullabilityQualifier.f76664a;
        NullabilityQualifier nullabilityQualifier4 = NullabilityQualifier.f76665b;
        NullabilityQualifier nullabilityQualifier5 = NullabilityQualifier.f76666c;
        if (d11 == nullabilityQualifier3) {
            nullabilityQualifier2 = nullabilityQualifier3;
        } else {
            nullabilityQualifier2 = (NullabilityQualifier) U(U0, nullabilityQualifier5, nullabilityQualifier4, d11, z5);
        }
        if (nullabilityQualifier2 == null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier d12 = ((do0.g) it2.next()).d();
                if (d12 != null) {
                    arrayList3.add(d12);
                }
            }
            Set U02 = kotlin.collections.x.U0(arrayList3);
            NullabilityQualifier d13 = gVar.d();
            if (d13 != nullabilityQualifier3) {
                nullabilityQualifier3 = (NullabilityQualifier) U(U02, nullabilityQualifier5, nullabilityQualifier4, d13, z5);
            }
        } else {
            nullabilityQualifier3 = nullabilityQualifier2;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier c11 = ((do0.g) it3.next()).c();
            if (c11 != null) {
                arrayList4.add(c11);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) U(kotlin.collections.x.U0(arrayList4), MutabilityQualifier.f76662b, MutabilityQualifier.f76661a, gVar.c(), z5);
        if (nullabilityQualifier3 != null && !z12 && (!z11 || nullabilityQualifier3 != nullabilityQualifier4)) {
            nullabilityQualifier = nullabilityQualifier3;
        }
        boolean z14 = false;
        if (nullabilityQualifier == nullabilityQualifier5) {
            if (!gVar.b()) {
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((do0.g) it4.next()).b()) {
                            z13 = true;
                            break;
                        }
                    }
                }
            } else {
                z13 = true;
                if (nullabilityQualifier != null && nullabilityQualifier2 != nullabilityQualifier3) {
                    z14 = true;
                }
                return new do0.g(nullabilityQualifier, mutabilityQualifier, z13, z14);
            }
        }
        z13 = false;
        if (nullabilityQualifier != null) {
            z14 = true;
        }
        return new do0.g(nullabilityQualifier, mutabilityQualifier, z13, z14);
    }

    public static void s(FragmentActivity fragmentActivity, boolean z5, int i11) {
        kotlin.jvm.internal.u.j(fragmentActivity, "<this>");
        androidx.core.view.m2 m2Var = new androidx.core.view.m2(fragmentActivity.getWindow().getDecorView(), fragmentActivity.getWindow());
        m2Var.d(z5);
        m2Var.c(false);
        if (fragmentActivity.getWindow().getStatusBarColor() != i11) {
            fragmentActivity.getWindow().setStatusBarColor(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(int i11) {
        switch (i11) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String u(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            androidx.collection.c.e("CBC", "decrypt 1 content is null");
            return "";
        } else if (TextUtils.isEmpty(str2)) {
            androidx.collection.c.e("CBC", "decrypt 1 key is null");
            return "";
        } else {
            byte[] i11 = mo.a.i(str2);
            if (i11.length < 16) {
                androidx.collection.c.e("CBC", "decrypt 1 key length is not right");
                return "";
            }
            return v(str, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String v(java.lang.String r11, byte[] r12) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            java.lang.String r1 = ""
            java.lang.String r2 = "CBC"
            if (r0 == 0) goto L10
            java.lang.String r11 = "decrypt 2 content is null"
            androidx.collection.c.e(r2, r11)
            return r1
        L10:
            if (r12 != 0) goto L18
            java.lang.String r11 = "decrypt 2 key is null"
            androidx.collection.c.e(r2, r11)
            return r1
        L18:
            int r0 = r12.length
            r3 = 16
            if (r0 >= r3) goto L23
            java.lang.String r11 = "decrypt 2 key lengh is not right"
            androidx.collection.c.e(r2, r11)
            return r1
        L23:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r4 = 48
            r5 = 32
            r6 = 26
            r7 = 12
            r8 = 6
            if (r0 == 0) goto L34
        L32:
            r0 = r1
            goto L6a
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L53
            r0.<init>()     // Catch: java.lang.Exception -> L53
            java.lang.String r9 = r11.substring(r8, r7)     // Catch: java.lang.Exception -> L53
            r0.append(r9)     // Catch: java.lang.Exception -> L53
            java.lang.String r9 = r11.substring(r3, r6)     // Catch: java.lang.Exception -> L53
            r0.append(r9)     // Catch: java.lang.Exception -> L53
            java.lang.String r9 = r11.substring(r5, r4)     // Catch: java.lang.Exception -> L53
            r0.append(r9)     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L53
            goto L6a
        L53:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "getIv exception : "
            r9.<init>(r10)
            java.lang.String r0 = r0.getMessage()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            androidx.collection.c.e(r2, r0)
            goto L32
        L6a:
            boolean r9 = android.text.TextUtils.isEmpty(r11)
            if (r9 == 0) goto L72
        L70:
            r11 = r1
            goto Lb0
        L72:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L99
            r9.<init>()     // Catch: java.lang.Exception -> L99
            r10 = 0
            java.lang.String r8 = r11.substring(r10, r8)     // Catch: java.lang.Exception -> L99
            r9.append(r8)     // Catch: java.lang.Exception -> L99
            java.lang.String r3 = r11.substring(r7, r3)     // Catch: java.lang.Exception -> L99
            r9.append(r3)     // Catch: java.lang.Exception -> L99
            java.lang.String r3 = r11.substring(r6, r5)     // Catch: java.lang.Exception -> L99
            r9.append(r3)     // Catch: java.lang.Exception -> L99
            java.lang.String r11 = r11.substring(r4)     // Catch: java.lang.Exception -> L99
            r9.append(r11)     // Catch: java.lang.Exception -> L99
            java.lang.String r11 = r9.toString()     // Catch: java.lang.Exception -> L99
            goto Lb0
        L99:
            r11 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "get encryptword exception : "
            r3.<init>(r4)
            java.lang.String r11 = r11.getMessage()
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            androidx.collection.c.e(r2, r11)
            goto L70
        Lb0:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto Lbc
            java.lang.String r11 = "decrypt 2 iv is null"
            androidx.collection.c.e(r2, r11)
            return r1
        Lbc:
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 == 0) goto Lc8
            java.lang.String r11 = "decrypt 2 encrypt content is null"
            androidx.collection.c.e(r2, r11)
            return r1
        Lc8:
            byte[] r0 = mo.a.i(r0)
            java.lang.String r11 = w(r11, r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.hwa08.postinstall.b0.v(java.lang.String, byte[]):java.lang.String");
    }

    public static String w(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            androidx.collection.c.e("CBC", "decrypt 4 content is null");
            return "";
        } else if (bArr == null) {
            androidx.collection.c.e("CBC", "decrypt 4 key is null");
            return "";
        } else if (bArr.length < 16) {
            androidx.collection.c.e("CBC", "decrypt 4 key lengh is not right");
            return "";
        } else if (bArr2.length < 16) {
            androidx.collection.c.e("CBC", "decrypt 4 iv lengh is not right");
            return "";
        } else {
            try {
                return new String(x(mo.a.i(str), bArr, bArr2), "UTF-8");
            } catch (UnsupportedEncodingException e11) {
                androidx.collection.c.e("CBC", " cbc decrypt data error" + e11.getMessage());
                return "";
            }
        }
    }

    public static byte[] x(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 0) {
            androidx.collection.c.e("CBC", "decrypt 6 content length is 0");
            return new byte[0];
        } else if (bArr2 == null) {
            androidx.collection.c.e("CBC", "decrypt 6 key is null");
            return new byte[0];
        } else if (bArr2.length < 16) {
            androidx.collection.c.e("CBC", "decrypt 6 key length is error");
            return new byte[0];
        } else if (bArr3 == null) {
            androidx.collection.c.e("CBC", "decrypt 6 iv is null");
            return new byte[0];
        } else if (bArr3.length < 16) {
            androidx.collection.c.e("CBC", "decrypt 6 iv length is error");
            return new byte[0];
        } else {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException e11) {
                androidx.collection.c.e("CBC", "InvalidAlgorithmParameterException: " + e11.getMessage());
                return new byte[0];
            } catch (InvalidKeyException e12) {
                androidx.collection.c.e("CBC", "InvalidKeyException: " + e12.getMessage());
                return new byte[0];
            } catch (NoSuchAlgorithmException e13) {
                androidx.collection.c.e("CBC", "NoSuchAlgorithmException: " + e13.getMessage());
                return new byte[0];
            } catch (BadPaddingException e14) {
                androidx.collection.c.e("CBC", "BadPaddingException: " + e14.getMessage());
                androidx.collection.c.e("CBC", "key is not right");
                return new byte[0];
            } catch (IllegalBlockSizeException e15) {
                androidx.collection.c.e("CBC", "IllegalBlockSizeException: " + e15.getMessage());
                return new byte[0];
            } catch (NoSuchPaddingException e16) {
                androidx.collection.c.e("CBC", "NoSuchPaddingException: " + e16.getMessage());
                return new byte[0];
            }
        }
    }

    public static String y(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            androidx.collection.c.e("CBC", "encrypt 1 content is null");
            return "";
        } else if (TextUtils.isEmpty(str2)) {
            androidx.collection.c.e("CBC", "encrypt 1 key is null");
            return "";
        } else {
            byte[] i11 = mo.a.i(str2);
            if (i11.length < 16) {
                androidx.collection.c.e("CBC", "encrypt 1 key length is not right");
                return "";
            }
            return z(str, i11);
        }
    }

    public static String z(String str, byte[] bArr) {
        byte[] bArr2;
        if (TextUtils.isEmpty(str)) {
            androidx.collection.c.e("CBC", "encrypt 2 content is null");
            return "";
        } else if (bArr == null) {
            androidx.collection.c.e("CBC", "encrypt 2 key is null");
            return "";
        } else if (bArr.length < 16) {
            androidx.collection.c.e("CBC", "encrypt 2 key lengh is not right");
            return "";
        } else {
            byte[] c11 = re.b.c(16);
            if (TextUtils.isEmpty(str)) {
                androidx.collection.c.e("CBC", "encrypt 5 content is null");
                bArr2 = new byte[0];
            } else if (bArr.length < 16) {
                androidx.collection.c.e("CBC", "encrypt 5 key lengh is not right");
                bArr2 = new byte[0];
            } else if (c11.length < 16) {
                androidx.collection.c.e("CBC", "encrypt 5 iv lengh is not right");
                bArr2 = new byte[0];
            } else {
                try {
                    bArr2 = B(str.getBytes("UTF-8"), bArr, c11);
                } catch (UnsupportedEncodingException e11) {
                    androidx.collection.c.e("CBC", " cbc encrypt data error" + e11.getMessage());
                    bArr2 = new byte[0];
                }
            }
            if (bArr2 == null || bArr2.length == 0) {
                return "";
            }
            String c12 = mo.a.c(c11);
            String c13 = mo.a.c(bArr2);
            if (TextUtils.isEmpty(c12) || TextUtils.isEmpty(c13)) {
                return "";
            }
            try {
                return c13.substring(0, 6) + c12.substring(0, 6) + c13.substring(6, 10) + c12.substring(6, 16) + c13.substring(10, 16) + c12.substring(16) + c13.substring(16);
            } catch (Exception e12) {
                androidx.collection.c.e("CBC", "mix exception: " + e12.getMessage());
                return "";
            }
        }
    }
}
