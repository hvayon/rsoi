package ru.hvayon.Gateway.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
public class InfoResponse {
    TicketResponse[] tickets;
    PrivilegeResponse privilege;
}