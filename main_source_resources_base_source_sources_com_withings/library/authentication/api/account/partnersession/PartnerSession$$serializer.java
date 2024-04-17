package com.withings.library.authentication.api.account.partnersession;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: PartnerSessionResponse.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/library/authentication/api/account/partnersession/PartnerSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/library/authentication/api/account/partnersession/PartnerSession;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/library/authentication/api/account/partnersession/PartnerSession;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/library/authentication/api/account/partnersession/PartnerSession;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PartnerSession$$serializer implements GeneratedSerializer<PartnerSession> {
    public static final PartnerSession$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PartnerSession$$serializer partnerSession$$serializer = new PartnerSession$$serializer();
        INSTANCE = partnerSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.library.authentication.api.account.partnersession.PartnerSession", partnerSession$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("providertoken", false);
        pluginGeneratedSerialDescriptor.addElement(ConstantsWs.JSON_SESSION_KEY_SESSIONID, false);
        pluginGeneratedSerialDescriptor.addElement("account", false);
        pluginGeneratedSerialDescriptor.addElement("auth_token", false);
        pluginGeneratedSerialDescriptor.addElement("require_secure_session", false);
        pluginGeneratedSerialDescriptor.addElement("timeToLive", true);
        pluginGeneratedSerialDescriptor.addElement("creationTime", true);
        pluginGeneratedSerialDescriptor.addElement("is_secure", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PartnerSession$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, PartnerAccount$$serializer.INSTANCE, stringSerializer, booleanSerializer, longSerializer, longSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PartnerSession deserialize(Decoder decoder) {
        boolean z5;
        int i11;
        PartnerAccount partnerAccount;
        boolean z11;
        long j5;
        long j11;
        String str;
        String str2;
        String str3;
        char c11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i12 = 7;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 3);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 4);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 5);
            long decodeLongElement2 = beginStructure.decodeLongElement(descriptor2, 6);
            str = decodeStringElement;
            z5 = beginStructure.decodeBooleanElement(descriptor2, 7);
            j5 = decodeLongElement2;
            str3 = decodeStringElement3;
            z11 = decodeBooleanElement;
            partnerAccount = (PartnerAccount) beginStructure.decodeSerializableElement(descriptor2, 2, PartnerAccount$$serializer.INSTANCE, null);
            str2 = decodeStringElement2;
            j11 = decodeLongElement;
            i11 = 255;
        } else {
            long j12 = 0;
            boolean z12 = true;
            boolean z13 = false;
            int i13 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            long j13 = 0;
            PartnerAccount partnerAccount2 = null;
            boolean z14 = false;
            while (z12) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z12 = false;
                        i12 = 7;
                    case 0:
                        str4 = beginStructure.decodeStringElement(descriptor2, 0);
                        i13 |= 1;
                        i12 = 7;
                    case 1:
                        c11 = 2;
                        str5 = beginStructure.decodeStringElement(descriptor2, 1);
                        i13 |= 2;
                        i12 = 7;
                    case 2:
                        c11 = 2;
                        partnerAccount2 = (PartnerAccount) beginStructure.decodeSerializableElement(descriptor2, 2, PartnerAccount$$serializer.INSTANCE, partnerAccount2);
                        i13 |= 4;
                        i12 = 7;
                    case 3:
                        str6 = beginStructure.decodeStringElement(descriptor2, 3);
                        i13 |= 8;
                    case 4:
                        z14 = beginStructure.decodeBooleanElement(descriptor2, 4);
                        i13 |= 16;
                    case 5:
                        j13 = beginStructure.decodeLongElement(descriptor2, 5);
                        i13 |= 32;
                    case 6:
                        j12 = beginStructure.decodeLongElement(descriptor2, 6);
                        i13 |= 64;
                    case 7:
                        z13 = beginStructure.decodeBooleanElement(descriptor2, i12);
                        i13 |= 128;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            z5 = z13;
            i11 = i13;
            partnerAccount = partnerAccount2;
            z11 = z14;
            j5 = j12;
            j11 = j13;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        beginStructure.endStructure(descriptor2);
        return new PartnerSession(i11, str, str2, partnerAccount, str3, z11, j11, j5, z5, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, PartnerSession value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        PartnerSession.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
