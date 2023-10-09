package com.yuzarsif.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold Account information"
)
public class AccountDto {

    @Schema(
            description = "Account Number of Bank Account", example = "3454433243"
    )
    @NotEmpty(message = "Account number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account Type of Bank Account", example = "savings"
    )
    @NotEmpty(message = "Account type can not be a null or empty")
    private String accountType;

    @Schema(
            description = "Bank Branch Address", example = "123 NewYork"
    )
    @NotEmpty(message = "Branch address can not be a null or empty")
    private String branchAddress;
}
