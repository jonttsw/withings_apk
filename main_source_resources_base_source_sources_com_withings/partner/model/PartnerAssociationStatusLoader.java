package com.withings.partner.model;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.camera.camera2.internal.p2;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import nm0.k;
import nm0.l;
import w6.o;
/* compiled from: Partner.kt */
/* loaded from: classes4.dex */
public final class PartnerAssociationStatusLoader {

    /* renamed from: a  reason: collision with root package name */
    private final Context f43513a;

    /* renamed from: b  reason: collision with root package name */
    private final Partner f43514b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Partner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/partner/model/PartnerAssociationStatusLoader$AssociationStatus;", "", "partner_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class AssociationStatus {

        /* renamed from: a  reason: collision with root package name */
        public static final AssociationStatus f43515a;

        /* renamed from: b  reason: collision with root package name */
        public static final AssociationStatus f43516b;

        /* renamed from: c  reason: collision with root package name */
        public static final AssociationStatus f43517c;

        /* renamed from: d  reason: collision with root package name */
        public static final AssociationStatus f43518d;

        /* renamed from: e  reason: collision with root package name */
        public static final AssociationStatus f43519e;

        /* renamed from: f  reason: collision with root package name */
        public static final AssociationStatus f43520f;

        /* renamed from: g  reason: collision with root package name */
        public static final AssociationStatus f43521g;

        /* renamed from: h  reason: collision with root package name */
        public static final AssociationStatus f43522h;

        /* renamed from: i  reason: collision with root package name */
        public static final AssociationStatus f43523i;

        /* renamed from: j  reason: collision with root package name */
        public static final AssociationStatus f43524j;

        /* renamed from: k  reason: collision with root package name */
        private static final /* synthetic */ AssociationStatus[] f43525k;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus] */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus] */
        /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus] */
        static {
            ?? r02 = new Enum("NO_NEED_TO_BE_CHECKED", 0);
            f43515a = r02;
            ?? r12 = new Enum("ALREADY_ASSOCIATED_WITH_PLATFORM", 1);
            f43516b = r12;
            ?? r22 = new Enum("MISSING_GOOGLE_SCOPE", 2);
            f43517c = r22;
            ?? r32 = new Enum("MISSING_GOOGLE_ACTIVITY_RECOGNITION", 3);
            f43518d = r32;
            ?? r42 = new Enum("NEED_GOOGLE_REACTIVATION", 4);
            f43519e = r42;
            ?? r52 = new Enum("MISSING_SAMSUNG_SCOPE", 5);
            f43520f = r52;
            ?? r62 = new Enum("NEED_HUAWEI_REACTIVATION", 6);
            f43521g = r62;
            ?? r7 = new Enum("MISSING_HEALTH_CONNECT_SCOPE", 7);
            f43522h = r7;
            ?? r82 = new Enum("OUTDATED_PLAY_SERVICES", 8);
            f43523i = r82;
            ?? r92 = new Enum("USER_ACTION_REQUIRED_ON_PLAY_SERVICES", 9);
            f43524j = r92;
            AssociationStatus[] associationStatusArr = {r02, r12, r22, r32, r42, r52, r62, r7, r82, r92};
            f43525k = associationStatusArr;
            sm0.b.a(associationStatusArr);
        }

        private AssociationStatus() {
            throw null;
        }

        public static AssociationStatus valueOf(String str) {
            return (AssociationStatus) Enum.valueOf(AssociationStatus.class, str);
        }

        public static AssociationStatus[] values() {
            return (AssociationStatus[]) f43525k.clone();
        }
    }

    public PartnerAssociationStatusLoader(Context context, User user, Partner partner) {
        u.j(user, "user");
        u.j(partner, "partner");
        this.f43513a = context;
        this.f43514b = partner;
    }

    public final String a(AssociationStatus associationStatus) {
        u.j(associationStatus, "associationStatus");
        int ordinal = associationStatus.ordinal();
        Context context = this.f43513a;
        switch (ordinal) {
            case 0:
                return "";
            case 1:
                String string = context.getString(C1987R.string.partnerAssociationError_AlreadyAssociatedWithPlatform, context.getString(this.f43514b.w()));
                u.i(string, "getString(...)");
                return string;
            case 2:
            case 4:
                String string2 = context.getString(C1987R.string.googleFit_reactivateTitle);
                u.i(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = context.getString(C1987R.string.partner_googleFit_stepImportPermission);
                u.i(string3, "getString(...)");
                return string3;
            case 5:
                String string4 = context.getString(C1987R.string.shealth_reactivateTitle);
                u.i(string4, "getString(...)");
                return string4;
            case 6:
                String string5 = context.getString(C1987R.string.huawaiHealth_reactivateTitle);
                u.i(string5, "getString(...)");
                return string5;
            case 7:
                return p2.c(context.getString(C1987R.string._HWA03_MISSING_PERMISSIONS_QUICK_SETTINGS_), ". ", context.getString(C1987R.string.googleHealthPlatform_description), ". ");
            case 8:
                String string6 = context.getString(C1987R.string.account_appDeprecated_title);
                u.i(string6, "getString(...)");
                return string6;
            case 9:
                return o.a(context.getString(C1987R.string._ERROR_), " : ", context.getString(C1987R.string.googleFit_configureApp));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String b(AssociationStatus associationStatus) {
        u.j(associationStatus, "associationStatus");
        int w11 = this.f43514b.w();
        Context context = this.f43513a;
        String string = context.getString(w11);
        u.i(string, "getString(...)");
        switch (associationStatus.ordinal()) {
            case 0:
                return "";
            case 1:
                String string2 = context.getString(C1987R.string.partnerAssociationError_AlreadyAssociatedWithPlatform, string);
                u.i(string2, "getString(...)");
                return string2;
            case 2:
            case 4:
                String string3 = context.getString(C1987R.string.googleFit_reactivateNotificationMessage);
                u.i(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = context.getString(C1987R.string.partner_googleFit_stepImportPermission);
                u.i(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = context.getString(C1987R.string.googleFit_reactivateNotificationMessage);
                u.i(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = context.getString(C1987R.string.googleFit_reactivateNotificationMessage);
                u.i(string6, "getString(...)");
                return string6;
            case 7:
                return p2.c(context.getString(C1987R.string.googleHealthPlatform_description), "  ", context.getString(C1987R.string.googleFit_reactivateNotificationMessage), ".");
            case 8:
            case 9:
                String string7 = context.getString(C1987R.string.account_appDeprecated_title);
                u.i(string7, "getString(...)");
                return string7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String c(AssociationStatus associationStatus) {
        Object a11;
        u.j(associationStatus, "associationStatus");
        int w11 = this.f43514b.w();
        Context context = this.f43513a;
        String string = context.getString(w11);
        u.i(string, "getString(...)");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.gms", 128);
            u.i(applicationInfo, "getApplicationInfo(...)");
            a11 = context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th2) {
            a11 = l.a(th2);
        }
        if (a11 instanceof k.a) {
            a11 = null;
        }
        String str = (String) a11;
        if (str == null) {
            str = "";
        }
        switch (associationStatus.ordinal()) {
            case 0:
                return "";
            case 1:
                String string2 = context.getString(C1987R.string.partnerAssociationError_AlreadyAssociatedWithPlatformTitle, string);
                u.i(string2, "getString(...)");
                return string2;
            case 2:
            case 4:
                String string3 = context.getString(C1987R.string.googleFit_reactivateNotificationTitle);
                u.i(string3, "getString(...)");
                return string3;
            case 3:
                return string;
            case 5:
                String string4 = context.getString(C1987R.string.shealth_reactivateNotificationTitle);
                u.i(string4, "getString(...)");
                return string4;
            case 6:
                String string5 = context.getString(C1987R.string.huaweiHealth_reactivateNotificationTitle);
                u.i(string5, "getString(...)");
                return string5;
            case 7:
                String string6 = context.getString(C1987R.string.googleHealthPlatform_title);
                u.i(string6, "getString(...)");
                return string6;
            case 8:
            case 9:
                return str;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
