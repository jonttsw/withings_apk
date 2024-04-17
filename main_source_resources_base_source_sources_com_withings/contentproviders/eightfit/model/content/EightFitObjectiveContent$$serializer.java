package com.withings.contentproviders.eightfit.model.content;

import com.samsung.android.sdk.healthdata.HealthConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: EightFitObjectiveContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/content/EightFitObjectiveContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EightFitObjectiveContent$$serializer implements GeneratedSerializer<EightFitObjectiveContent> {
    public static final EightFitObjectiveContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EightFitObjectiveContent$$serializer eightFitObjectiveContent$$serializer = new EightFitObjectiveContent$$serializer();
        INSTANCE = eightFitObjectiveContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.content.EightFitObjectiveContent", eightFitObjectiveContent$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement(HealthConstants.FoodInfo.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement("measureType", false);
        pluginGeneratedSerialDescriptor.addElement("goal", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedDevices", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EightFitObjectiveContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = EightFitObjectiveContent.access$get$childSerializers$cp();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, access$get$childSerializers$cp[1], stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, IntSerializer.INSTANCE, DoubleSerializer.INSTANCE, access$get$childSerializers$cp[7]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EightFitObjectiveContent deserialize(Decoder decoder) {
        int i11;
        List list;
        String str;
        int i12;
        String str2;
        List list2;
        String str3;
        String str4;
        double d11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] access$get$childSerializers$cp = EightFitObjectiveContent.access$get$childSerializers$cp();
        int i13 = 6;
        int i14 = 5;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 4);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 5);
            double decodeDoubleElement = beginStructure.decodeDoubleElement(descriptor2, 6);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 7, access$get$childSerializers$cp[7], null);
            str2 = decodeStringElement;
            i11 = 255;
            i12 = decodeIntElement;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, null);
            str4 = decodeStringElement3;
            str3 = decodeStringElement2;
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, access$get$childSerializers$cp[1], null);
            d11 = decodeDoubleElement;
        } else {
            boolean z5 = true;
            int i15 = 0;
            List list3 = null;
            String str5 = null;
            String str6 = null;
            double d12 = 0.0d;
            String str7 = null;
            List list4 = null;
            String str8 = null;
            int i16 = 0;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i13 = 6;
                        i14 = 5;
                        break;
                    case 0:
                        str7 = beginStructure.decodeStringElement(descriptor2, 0);
                        i15 |= 1;
                        i13 = 6;
                        i14 = 5;
                        break;
                    case 1:
                        list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, access$get$childSerializers$cp[1], list4);
                        i15 |= 2;
                        i13 = 6;
                        i14 = 5;
                        break;
                    case 2:
                        str5 = beginStructure.decodeStringElement(descriptor2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str8);
                        i15 |= 8;
                        break;
                    case 4:
                        str6 = beginStructure.decodeStringElement(descriptor2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        i16 = beginStructure.decodeIntElement(descriptor2, i14);
                        i15 |= 32;
                        break;
                    case 6:
                        d12 = beginStructure.decodeDoubleElement(descriptor2, i13);
                        i15 |= 64;
                        break;
                    case 7:
                        list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 7, access$get$childSerializers$cp[7], list3);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i15;
            list = list3;
            str = str8;
            i12 = i16;
            str2 = str7;
            list2 = list4;
            str3 = str5;
            str4 = str6;
            d11 = d12;
        }
        beginStructure.endStructure(descriptor2);
        return new EightFitObjectiveContent(i11, str2, list2, str3, str, str4, i12, d11, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, EightFitObjectiveContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        EightFitObjectiveContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
