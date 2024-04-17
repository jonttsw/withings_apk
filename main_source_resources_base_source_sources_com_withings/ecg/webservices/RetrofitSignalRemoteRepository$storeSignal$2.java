package com.withings.ecg.webservices;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitSignalRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/ecg/webservices/StoreSignalResponse;", "Lcom/withings/ecg/webservices/SignalRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitSignalRemoteRepository$storeSignal$2 extends w implements l<SignalRetrofit1Api, StoreSignalResponse> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ long $duration;
    final /* synthetic */ Integer $firmwareVersion;
    final /* synthetic */ int $metaChannel;
    final /* synthetic */ long $metaFilterBank;
    final /* synthetic */ long $metaFix;
    final /* synthetic */ int $metaFormat;
    final /* synthetic */ int $metaFreq;
    final /* synthetic */ int $metaGain;
    final /* synthetic */ int $metaOffset;
    final /* synthetic */ int $metaResolution;
    final /* synthetic */ int $metaSize;
    final /* synthetic */ Integer $metaWearPosition;
    final /* synthetic */ String $signal;
    final /* synthetic */ int $signalType;
    final /* synthetic */ long $timestamp;
    final /* synthetic */ long $totalSize;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitSignalRemoteRepository$storeSignal$2(String str, long j5, int i11, long j11, int i12, int i13, int i14, int i15, int i16, int i17, long j12, int i18, long j13, long j14, long j15, long j16, Integer num, Integer num2) {
        super(1);
        this.$signal = str;
        this.$userId = j5;
        this.$signalType = i11;
        this.$timestamp = j11;
        this.$metaFreq = i12;
        this.$metaFormat = i13;
        this.$metaSize = i14;
        this.$metaResolution = i15;
        this.$metaChannel = i16;
        this.$metaGain = i17;
        this.$metaFix = j12;
        this.$metaOffset = i18;
        this.$deviceId = j13;
        this.$duration = j14;
        this.$totalSize = j15;
        this.$metaFilterBank = j16;
        this.$metaWearPosition = num;
        this.$firmwareVersion = num2;
    }

    @Override // ym0.l
    public final StoreSignalResponse invoke(SignalRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.storeSignal(this.$signal, this.$userId, this.$signalType, this.$timestamp, this.$metaFreq, this.$metaFormat, this.$metaSize, this.$metaResolution, this.$metaChannel, this.$metaGain, this.$metaFix, this.$metaOffset, this.$deviceId, this.$duration, this.$totalSize, this.$metaFilterBank, this.$metaWearPosition, this.$firmwareVersion);
    }
}
