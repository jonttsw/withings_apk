package com.withings.account.models;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: KeyStoreCipher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/withings/account/models/AndroidKeyStoreCipher;", "Lcom/withings/account/models/KeyStoreCipher;", "Ljavax/crypto/SecretKey;", "getSecretKey", "()Ljavax/crypto/SecretKey;", "generateSecretKey", "", "data", "encrypt", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "decrypt", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "<init>", "()V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AndroidKeyStoreCipher implements KeyStoreCipher {
    private static final int IV_SIZE = 12;
    private static final String SECRET_KEY_ALIAS = "com.withings.account.model.AndroidKeyStoreCipher";
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: KeyStoreCipher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/account/models/AndroidKeyStoreCipher$Companion;", "", "()V", "IV_SIZE", "", "SECRET_KEY_ALIAS", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    private final SecretKey generateSecretKey() {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        u.i(keyGenerator, "getInstance(...)");
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(SECRET_KEY_ALIAS, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build();
        u.i(build, "build(...)");
        keyGenerator.init(build);
        SecretKey generateKey = keyGenerator.generateKey();
        u.i(generateKey, "generateKey(...)");
        return generateKey;
    }

    private final SecretKey getSecretKey() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        SecretKey secretKey = null;
        keyStore.load(null);
        KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry(SECRET_KEY_ALIAS, null);
        if (secretKeyEntry != null) {
            secretKey = secretKeyEntry.getSecretKey();
        }
        if (secretKey == null) {
            return generateSecretKey();
        }
        return secretKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    @Override // com.withings.account.models.KeyStoreCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object decrypt(java.lang.String r8, qm0.d<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.withings.account.models.AndroidKeyStoreCipher$decrypt$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.account.models.AndroidKeyStoreCipher$decrypt$1 r0 = (com.withings.account.models.AndroidKeyStoreCipher$decrypt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.account.models.AndroidKeyStoreCipher$decrypt$1 r0 = new com.withings.account.models.AndroidKeyStoreCipher$decrypt$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.withings.account.models.AndroidKeyStoreCipher r0 = (com.withings.account.models.AndroidKeyStoreCipher) r0
            nm0.l.b(r9)
            r9 = r8
            r8 = r1
            goto L53
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            nm0.l.b(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.mutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r7
        L53:
            javax.crypto.SecretKey r0 = r0.getSecretKey()     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L98
            java.nio.charset.Charset r2 = dp0.c.f64094b     // Catch: java.lang.Throwable -> L98
            byte[] r8 = r8.getBytes(r2)     // Catch: java.lang.Throwable -> L98
            java.lang.String r5 = "getBytes(...)"
            kotlin.jvm.internal.u.i(r8, r5)     // Catch: java.lang.Throwable -> L98
            byte[] r8 = android.util.Base64.decode(r8, r3)     // Catch: java.lang.Throwable -> L98
            kotlin.jvm.internal.u.g(r8)     // Catch: java.lang.Throwable -> L98
            r3 = 0
            r5 = 12
            byte[] r3 = kotlin.collections.l.t(r3, r5, r8)     // Catch: java.lang.Throwable -> L98
            int r6 = r8.length     // Catch: java.lang.Throwable -> L98
            byte[] r8 = kotlin.collections.l.t(r5, r6, r8)     // Catch: java.lang.Throwable -> L98
            javax.crypto.spec.GCMParameterSpec r5 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.lang.Throwable -> L98
            r6 = 128(0x80, float:1.794E-43)
            r5.<init>(r6, r3)     // Catch: java.lang.Throwable -> L98
            r3 = 2
            r1.init(r3, r0, r5)     // Catch: java.lang.Throwable -> L98
            byte[] r8 = r1.doFinal(r8)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "doFinal(...)"
            kotlin.jvm.internal.u.i(r8, r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L98
            r0.<init>(r8, r2)     // Catch: java.lang.Throwable -> L98
            r9.unlock(r4)
            return r0
        L98:
            r8 = move-exception
            r9.unlock(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.account.models.AndroidKeyStoreCipher.decrypt(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    @Override // com.withings.account.models.KeyStoreCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object encrypt(java.lang.String r8, qm0.d<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.withings.account.models.AndroidKeyStoreCipher$encrypt$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.account.models.AndroidKeyStoreCipher$encrypt$1 r0 = (com.withings.account.models.AndroidKeyStoreCipher$encrypt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.account.models.AndroidKeyStoreCipher$encrypt$1 r0 = new com.withings.account.models.AndroidKeyStoreCipher$encrypt$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.withings.account.models.AndroidKeyStoreCipher r0 = (com.withings.account.models.AndroidKeyStoreCipher) r0
            nm0.l.b(r9)
            r9 = r8
            r8 = r1
            goto L53
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            nm0.l.b(r9)
            kotlinx.coroutines.sync.Mutex r9 = r7.mutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r0 = r7
        L53:
            javax.crypto.SecretKey r0 = r0.getSecretKey()     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "getInstance(...)"
            kotlin.jvm.internal.u.i(r1, r2)     // Catch: java.lang.Throwable -> La1
            r1.init(r3, r0)     // Catch: java.lang.Throwable -> La1
            java.nio.charset.Charset r0 = dp0.c.f64094b     // Catch: java.lang.Throwable -> La1
            byte[] r8 = r8.getBytes(r0)     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "getBytes(...)"
            kotlin.jvm.internal.u.i(r8, r2)     // Catch: java.lang.Throwable -> La1
            byte[] r8 = r1.doFinal(r8)     // Catch: java.lang.Throwable -> La1
            byte[] r1 = r1.getIV()     // Catch: java.lang.Throwable -> La1
            java.lang.String r2 = "getIV(...)"
            kotlin.jvm.internal.u.i(r1, r2)     // Catch: java.lang.Throwable -> La1
            kotlin.jvm.internal.u.g(r8)     // Catch: java.lang.Throwable -> La1
            int r2 = r1.length     // Catch: java.lang.Throwable -> La1
            int r5 = r8.length     // Catch: java.lang.Throwable -> La1
            int r6 = r2 + r5
            byte[] r1 = java.util.Arrays.copyOf(r1, r6)     // Catch: java.lang.Throwable -> La1
            r6 = 0
            java.lang.System.arraycopy(r8, r6, r1, r2, r5)     // Catch: java.lang.Throwable -> La1
            kotlin.jvm.internal.u.g(r1)     // Catch: java.lang.Throwable -> La1
            byte[] r8 = android.util.Base64.encode(r1, r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = "encode(...)"
            kotlin.jvm.internal.u.i(r8, r1)     // Catch: java.lang.Throwable -> La1
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> La1
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> La1
            r9.unlock(r4)
            return r1
        La1:
            r8 = move-exception
            r9.unlock(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.account.models.AndroidKeyStoreCipher.encrypt(java.lang.String, qm0.d):java.lang.Object");
    }
}
