package com.withings.account.core.model;

import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTimeZone;
import sf.c;
/* compiled from: Account.kt */
/* loaded from: classes3.dex */
public final class Account {

    /* renamed from: a  reason: collision with root package name */
    private final String f30927a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f30928b;

    /* renamed from: c  reason: collision with root package name */
    private final Locale f30929c;

    /* renamed from: d  reason: collision with root package name */
    private final DateTimeZone f30930d;

    /* renamed from: e  reason: collision with root package name */
    private final a f30931e;

    /* renamed from: f  reason: collision with root package name */
    private final b f30932f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f30933g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f30934h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f30935i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Account.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/account/core/model/Account$AccountType;", "", "core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class AccountType {

        /* renamed from: a  reason: collision with root package name */
        public static final AccountType f30936a;

        /* renamed from: b  reason: collision with root package name */
        public static final AccountType f30937b;

        /* renamed from: c  reason: collision with root package name */
        public static final AccountType f30938c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ AccountType[] f30939d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.account.core.model.Account$AccountType] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.account.core.model.Account$AccountType] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.account.core.model.Account$AccountType] */
        static {
            ?? r02 = new Enum("MAIN", 0);
            f30936a = r02;
            ?? r12 = new Enum("WITHINGS", 1);
            f30937b = r12;
            ?? r22 = new Enum("PARTNER", 2);
            f30938c = r22;
            AccountType[] accountTypeArr = {r02, r12, r22};
            f30939d = accountTypeArr;
            sm0.b.a(accountTypeArr);
        }

        private AccountType() {
            throw null;
        }

        public static AccountType valueOf(String str) {
            return (AccountType) Enum.valueOf(AccountType.class, str);
        }

        public static AccountType[] values() {
            return (AccountType[]) f30939d.clone();
        }
    }

    /* compiled from: Account.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f30940a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f30941b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f30942c;

        public a(boolean z5, boolean z11, boolean z12) {
            this.f30940a = z5;
            this.f30941b = z11;
            this.f30942c = z12;
        }

        public final boolean a() {
            return this.f30941b;
        }

        public final boolean b() {
            return this.f30942c;
        }

        public final boolean c() {
            return this.f30940a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f30940a == aVar.f30940a && this.f30941b == aVar.f30941b && this.f30942c == aVar.f30942c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f30942c) + y1.a(this.f30941b, Boolean.hashCode(this.f30940a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Flags(isWpm03AcknowledgmentRequired=");
            sb2.append(this.f30940a);
            sb2.append(", isFqa=");
            sb2.append(this.f30941b);
            sb2.append(", isSqa=");
            return h.d(sb2, this.f30942c, ")");
        }
    }

    /* compiled from: Account.kt */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f30943a;

        /* renamed from: b  reason: collision with root package name */
        private final String f30944b;

        /* renamed from: c  reason: collision with root package name */
        private final AccountType f30945c;

        /* renamed from: d  reason: collision with root package name */
        private final String f30946d;

        /* renamed from: e  reason: collision with root package name */
        private final c f30947e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f30948f;

        /* renamed from: g  reason: collision with root package name */
        private final a f30949g;

        /* compiled from: Account.kt */
        /* loaded from: classes3.dex */
        public static abstract class a {

            /* compiled from: Account.kt */
            /* renamed from: com.withings.account.core.model.Account$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0404a extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final C0404a f30950a = new C0404a();

                private C0404a() {
                    super(0);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0404a)) {
                        return false;
                    }
                    C0404a c0404a = (C0404a) obj;
                    return true;
                }

                public final int hashCode() {
                    return 1623366314;
                }

                public final String toString() {
                    return "Deactivated";
                }
            }

            /* compiled from: Account.kt */
            /* renamed from: com.withings.account.core.model.Account$b$a$b  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0405b extends a {

                /* renamed from: a  reason: collision with root package name */
                private final String f30951a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0405b(String email) {
                    super(0);
                    u.j(email, "email");
                    this.f30951a = email;
                }

                public final String a() {
                    return this.f30951a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof C0405b) && u.e(this.f30951a, ((C0405b) obj).f30951a)) {
                        return true;
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f30951a.hashCode();
                }

                public final String toString() {
                    return y1.e(new StringBuilder("EmailChangeRequested(email="), this.f30951a, ")");
                }
            }

            /* compiled from: Account.kt */
            /* loaded from: classes3.dex */
            public static final class c extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final c f30952a = new c();

                private c() {
                    super(0);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return true;
                }

                public final int hashCode() {
                    return -691279051;
                }

                public final String toString() {
                    return "NeedValidation";
                }
            }

            /* compiled from: Account.kt */
            /* loaded from: classes3.dex */
            public static final class d extends a {

                /* renamed from: a  reason: collision with root package name */
                public static final d f30953a = new d();

                private d() {
                    super(0);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return true;
                }

                public final int hashCode() {
                    return 270281928;
                }

                public final String toString() {
                    return "Validated";
                }
            }

            public /* synthetic */ a(int i11) {
                this();
            }

            private a() {
            }
        }

        public b(long j5, String str, AccountType accountType, String str2, c authentication, boolean z5, a state) {
            u.j(accountType, "accountType");
            u.j(authentication, "authentication");
            u.j(state, "state");
            this.f30943a = j5;
            this.f30944b = str;
            this.f30945c = accountType;
            this.f30946d = str2;
            this.f30947e = authentication;
            this.f30948f = z5;
            this.f30949g = state;
        }

        public static b a(b bVar, long j5, c cVar, boolean z5, a aVar, int i11) {
            if ((i11 & 1) != 0) {
                j5 = bVar.f30943a;
            }
            long j11 = j5;
            String str = bVar.f30944b;
            AccountType accountType = bVar.f30945c;
            String domain = bVar.f30946d;
            if ((i11 & 16) != 0) {
                cVar = bVar.f30947e;
            }
            c authentication = cVar;
            if ((i11 & 32) != 0) {
                z5 = bVar.f30948f;
            }
            boolean z11 = z5;
            if ((i11 & 64) != 0) {
                aVar = bVar.f30949g;
            }
            a state = aVar;
            bVar.getClass();
            u.j(accountType, "accountType");
            u.j(domain, "domain");
            u.j(authentication, "authentication");
            u.j(state, "state");
            return new b(j11, str, accountType, domain, authentication, z11, state);
        }

        public final long b() {
            return this.f30943a;
        }

        public final AccountType c() {
            return this.f30945c;
        }

        public final c d() {
            return this.f30947e;
        }

        public final boolean e() {
            return this.f30948f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f30943a == bVar.f30943a && u.e(this.f30944b, bVar.f30944b) && this.f30945c == bVar.f30945c && u.e(this.f30946d, bVar.f30946d) && u.e(this.f30947e, bVar.f30947e) && this.f30948f == bVar.f30948f && u.e(this.f30949g, bVar.f30949g)) {
                return true;
            }
            return false;
        }

        public final a f() {
            return this.f30949g;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = Long.hashCode(this.f30943a) * 31;
            String str = this.f30944b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = this.f30945c.hashCode();
            int c11 = d.c(this.f30946d, (hashCode3 + ((hashCode2 + hashCode) * 31)) * 31, 31);
            return this.f30949g.hashCode() + y1.a(this.f30948f, (this.f30947e.hashCode() + c11) * 31, 31);
        }

        public final String toString() {
            return "Source(accountId=" + this.f30943a + ", partnerEmail=" + this.f30944b + ", accountType=" + this.f30945c + ", domain=" + this.f30946d + ", authentication=" + this.f30947e + ", requireSecureSession=" + this.f30948f + ", state=" + this.f30949g + ")";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Account(java.lang.String r17, sf.d r18, java.lang.String r19) {
        /*
            r16 = this;
            java.lang.String r0 = "email"
            r2 = r17
            kotlin.jvm.internal.u.j(r2, r0)
            java.lang.String r0 = "healthmateSession"
            r1 = r18
            kotlin.jvm.internal.u.j(r1, r0)
            java.lang.String r0 = "virtualDeviceToken"
            r3 = r19
            kotlin.jvm.internal.u.j(r3, r0)
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r0 = "getDefault(...)"
            kotlin.jvm.internal.u.i(r4, r0)
            org.joda.time.DateTimeZone r5 = org.joda.time.DateTimeZone.getDefault()
            kotlin.jvm.internal.u.i(r5, r0)
            com.withings.account.core.model.Account$a r6 = new com.withings.account.core.model.Account$a
            r0 = 0
            r6.<init>(r0, r0, r0)
            com.withings.account.core.model.Account$b r0 = new com.withings.account.core.model.Account$b
            long r8 = r18.b()
            com.withings.account.core.model.HealthmateSessionType r7 = r18.o()
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.u.j(r7, r10)
            int r7 = r7.ordinal()
            if (r7 == 0) goto L53
            r10 = 1
            if (r7 == r10) goto L50
            r10 = 2
            if (r7 != r10) goto L4a
            com.withings.account.core.model.Account$AccountType r7 = com.withings.account.core.model.Account.AccountType.f30938c
        L48:
            r11 = r7
            goto L56
        L4a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L50:
            com.withings.account.core.model.Account$AccountType r7 = com.withings.account.core.model.Account.AccountType.f30937b
            goto L48
        L53:
            com.withings.account.core.model.Account$AccountType r7 = com.withings.account.core.model.Account.AccountType.f30936a
            goto L48
        L56:
            sf.c$b r13 = sf.a.a(r18, r19)
            boolean r14 = r18.l()
            com.withings.account.core.model.Account$b$a$d r15 = com.withings.account.core.model.Account.b.a.d.f30953a
            r10 = 0
            java.lang.String r12 = ""
            r7 = r0
            r7.<init>(r8, r10, r11, r12, r13, r14, r15)
            r3 = 1
            r8 = 1
            r9 = 0
            r10 = 0
            r1 = r16
            r2 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.account.core.model.Account.<init>(java.lang.String, sf.d, java.lang.String):void");
    }

    public static Account a(Account account, String str, boolean z5, Locale locale, DateTimeZone dateTimeZone, a aVar, b bVar, boolean z11, boolean z12, boolean z13, int i11) {
        String email;
        boolean z14;
        Locale locale2;
        DateTimeZone timeZone;
        a flags;
        b source;
        boolean z15;
        boolean z16;
        boolean z17;
        if ((i11 & 1) != 0) {
            email = account.f30927a;
        } else {
            email = str;
        }
        if ((i11 & 2) != 0) {
            z14 = account.f30928b;
        } else {
            z14 = z5;
        }
        if ((i11 & 4) != 0) {
            locale2 = account.f30929c;
        } else {
            locale2 = locale;
        }
        if ((i11 & 8) != 0) {
            timeZone = account.f30930d;
        } else {
            timeZone = dateTimeZone;
        }
        if ((i11 & 16) != 0) {
            flags = account.f30931e;
        } else {
            flags = aVar;
        }
        if ((i11 & 32) != 0) {
            source = account.f30932f;
        } else {
            source = bVar;
        }
        if ((i11 & 64) != 0) {
            z15 = account.f30933g;
        } else {
            z15 = z11;
        }
        if ((i11 & 128) != 0) {
            z16 = account.f30934h;
        } else {
            z16 = z12;
        }
        if ((i11 & 256) != 0) {
            z17 = account.f30935i;
        } else {
            z17 = z13;
        }
        account.getClass();
        u.j(email, "email");
        u.j(locale2, "locale");
        u.j(timeZone, "timeZone");
        u.j(flags, "flags");
        u.j(source, "source");
        return new Account(email, z14, locale2, timeZone, flags, source, z15, z16, z17);
    }

    public final String b() {
        return this.f30927a;
    }

    public final a c() {
        return this.f30931e;
    }

    public final boolean d() {
        return this.f30928b;
    }

    public final long e() {
        return this.f30932f.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account account = (Account) obj;
        if (u.e(this.f30927a, account.f30927a) && this.f30928b == account.f30928b && u.e(this.f30929c, account.f30929c) && u.e(this.f30930d, account.f30930d) && u.e(this.f30931e, account.f30931e) && u.e(this.f30932f, account.f30932f) && this.f30933g == account.f30933g && this.f30934h == account.f30934h && this.f30935i == account.f30935i) {
            return true;
        }
        return false;
    }

    public final Locale f() {
        return this.f30929c;
    }

    public final boolean g() {
        return this.f30933g;
    }

    public final boolean h() {
        return this.f30935i;
    }

    public final int hashCode() {
        int a11 = y1.a(this.f30928b, this.f30927a.hashCode() * 31, 31);
        int hashCode = this.f30930d.hashCode();
        int hashCode2 = this.f30931e.hashCode();
        int hashCode3 = this.f30932f.hashCode();
        return Boolean.hashCode(this.f30935i) + y1.a(this.f30934h, y1.a(this.f30933g, (hashCode3 + ((hashCode2 + ((hashCode + ((this.f30929c.hashCode() + a11) * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final b i() {
        return this.f30932f;
    }

    public final boolean j() {
        return this.f30934h;
    }

    public final DateTimeZone k() {
        return this.f30930d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Account(email=");
        sb2.append(this.f30927a);
        sb2.append(", hasPassword=");
        sb2.append(this.f30928b);
        sb2.append(", locale=");
        sb2.append(this.f30929c);
        sb2.append(", timeZone=");
        sb2.append(this.f30930d);
        sb2.append(", flags=");
        sb2.append(this.f30931e);
        sb2.append(", source=");
        sb2.append(this.f30932f);
        sb2.append(", needSync=");
        sb2.append(this.f30933g);
        sb2.append(", termsOfUsage=");
        sb2.append(this.f30934h);
        sb2.append(", privacyPolicy=");
        return h.d(sb2, this.f30935i, ")");
    }

    public Account(String email, boolean z5, Locale locale, DateTimeZone dateTimeZone, a aVar, b source, boolean z11, boolean z12, boolean z13) {
        u.j(email, "email");
        u.j(locale, "locale");
        u.j(source, "source");
        this.f30927a = email;
        this.f30928b = z5;
        this.f30929c = locale;
        this.f30930d = dateTimeZone;
        this.f30931e = aVar;
        this.f30932f = source;
        this.f30933g = z11;
        this.f30934h = z12;
        this.f30935i = z13;
    }
}
