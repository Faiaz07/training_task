package com.htmcse.traintask

import com.htmcse.tasktrain.ContactDetailsService
import com.htmcse.tasktrain.ContactService
import grails.converters.JSON

class ContactDetailsController {

    ContactDetailsService contactDetailsService
    ContactService contactService

    def create() {
        Contact contact = contactService.get(params.id)
        [contactDetails: contactDetailsService.getContactDetailsListByContact(contact)]
    }

    def delete(Integer id){
        render(contactDetailsService.deleteContactDetails(id) as JSON)
    }
}
