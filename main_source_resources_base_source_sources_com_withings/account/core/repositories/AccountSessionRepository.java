package com.withings.account.core.repositories;

import com.google.firebase.perf.metrics.resource.ResourceType;
import java.util.List;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: AccountSessionRepository.kt */
/* loaded from: classes3.dex */
public interface AccountSessionRepository {

    /* compiled from: AccountSessionRepository.kt */
    /* loaded from: classes3.dex */
    public interface Error {

        /* compiled from: AccountSessionRepository.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/account/core/repositories/AccountSessionRepository$Error$AccountNotRegisteredException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class AccountNotRegisteredException extends Exception {
            public AccountNotRegisteredException(long j5) {
                super(ah.a.c("Account ", j5, " is not registered, can't get session"));
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/account/core/repositories/AccountSessionRepository$Error$GenericErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "core"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class GenericErrorException extends Exception {

            /* renamed from: a  reason: collision with root package name */
            public static final GenericErrorException f30962a = new GenericErrorException();

            private GenericErrorException() {
                super("GenericErrorException");
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GenericErrorException)) {
                    return false;
                }
                GenericErrorException genericErrorException = (GenericErrorException) obj;
                return true;
            }

            public final int hashCode() {
                return 1097574815;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "GenericErrorException";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/account/core/repositories/AccountSessionRepository$Error$NetworkErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "core"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class NetworkErrorException extends Exception {

            /* renamed from: a  reason: collision with root package name */
            public static final NetworkErrorException f30963a = new NetworkErrorException();

            private NetworkErrorException() {
                super("Network error");
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NetworkErrorException)) {
                    return false;
                }
                NetworkErrorException networkErrorException = (NetworkErrorException) obj;
                return true;
            }

            public final int hashCode() {
                return 148444598;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "NetworkErrorException";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/account/core/repositories/AccountSessionRepository$Error$TokenExpiredException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "core"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class TokenExpiredException extends Exception {

            /* renamed from: a  reason: collision with root package name */
            public static final TokenExpiredException f30964a = new TokenExpiredException();

            private TokenExpiredException() {
                super("Token expired");
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TokenExpiredException)) {
                    return false;
                }
                TokenExpiredException tokenExpiredException = (TokenExpiredException) obj;
                return true;
            }

            public final int hashCode() {
                return 1292558212;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "TokenExpiredException";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/account/core/repositories/AccountSessionRepository$Error$TooManyRequestException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "core"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class TooManyRequestException extends Exception {

            /* renamed from: a  reason: collision with root package name */
            public static final TooManyRequestException f30965a = new TooManyRequestException();

            private TooManyRequestException() {
                super("Too many request");
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TooManyRequestException)) {
                    return false;
                }
                TooManyRequestException tooManyRequestException = (TooManyRequestException) obj;
                return true;
            }

            public final int hashCode() {
                return -1079614732;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "TooManyRequestException";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/account/core/repositories/AccountSessionRepository$Error$WithingsErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class WithingsErrorException extends Exception {
        }

        /* compiled from: AccountSessionRepository.kt */
        /* loaded from: classes3.dex */
        public static final class a implements Error {

            /* renamed from: a  reason: collision with root package name */
            public static final a f30966a = new a();

            private a() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return true;
            }

            public final int hashCode() {
                return -1898906140;
            }

            public final String toString() {
                return "AuthFailed";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        /* loaded from: classes3.dex */
        public static final class b implements Error {

            /* renamed from: a  reason: collision with root package name */
            public static final b f30967a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return true;
            }

            public final int hashCode() {
                return 1285782641;
            }

            public final String toString() {
                return "Deactivated";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        /* loaded from: classes3.dex */
        public static final class c implements Error {

            /* renamed from: a  reason: collision with root package name */
            public static final c f30968a = new c();

            private c() {
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
                return 333934680;
            }

            public final String toString() {
                return "Generic";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        /* loaded from: classes3.dex */
        public static final class d implements Error {

            /* renamed from: a  reason: collision with root package name */
            public static final d f30969a = new d();

            private d() {
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
                return -2037399377;
            }

            public final String toString() {
                return ResourceType.NETWORK;
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        /* loaded from: classes3.dex */
        public static final class e implements Error {

            /* renamed from: a  reason: collision with root package name */
            public static final e f30970a = new e();

            private e() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return true;
            }

            public final int hashCode() {
                return -707082869;
            }

            public final String toString() {
                return "PasswordExpired";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        /* loaded from: classes3.dex */
        public static final class f implements Error {

            /* renamed from: a  reason: collision with root package name */
            public static final f f30971a = new f();

            private f() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return true;
            }

            public final int hashCode() {
                return -1398992959;
            }

            public final String toString() {
                return "RequireTwoFA";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        /* loaded from: classes3.dex */
        public static final class g implements Error {

            /* renamed from: a  reason: collision with root package name */
            public static final g f30972a = new g();

            private g() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return true;
            }

            public final int hashCode() {
                return -1859149866;
            }

            public final String toString() {
                return "RequireTwoFAPhoneNumber";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        /* loaded from: classes3.dex */
        public static final class h implements Error {

            /* renamed from: a  reason: collision with root package name */
            public static final h f30973a = new h();

            private h() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return true;
            }

            public final int hashCode() {
                return 1808633099;
            }

            public final String toString() {
                return "TokenExpired";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        /* loaded from: classes3.dex */
        public static final class i implements Error {

            /* renamed from: a  reason: collision with root package name */
            public static final i f30974a = new i();

            private i() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return true;
            }

            public final int hashCode() {
                return 1564175259;
            }

            public final String toString() {
                return "TooManyRequest";
            }
        }

        /* compiled from: AccountSessionRepository.kt */
        /* loaded from: classes3.dex */
        public static final class j implements Error {

            /* renamed from: a  reason: collision with root package name */
            public static final j f30975a = new j();

            private j() {
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return true;
            }

            public final int hashCode() {
                return -988435402;
            }

            public final String toString() {
                return "Withings";
            }
        }
    }

    /* compiled from: AccountSessionRepository.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static AccountSessionRepository f30976a;

        public static AccountSessionRepository a() {
            AccountSessionRepository accountSessionRepository = f30976a;
            if (accountSessionRepository != null) {
                return accountSessionRepository;
            }
            throw new IllegalArgumentException("You must call init before".toString());
        }

        public static void b(AccountSessionRepository accountSessionRepository) {
            f30976a = accountSessionRepository;
        }
    }

    /* compiled from: AccountSessionRepository.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void a(Error error);
    }

    Object a(d<? super List<sf.d>> dVar);

    Object b(long j5, sf.d dVar, d<? super y> dVar2);

    Object clear(d<? super y> dVar);

    Object d(long j5, d<? super y> dVar);

    Object e(long j5, boolean z5, d<? super sf.d> dVar);
}
