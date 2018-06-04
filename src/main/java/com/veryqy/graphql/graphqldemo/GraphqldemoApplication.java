package com.veryqy.graphql.graphqldemo;


import graphql.execution.ExecutionStrategy;
import graphql.schema.GraphQLSchema;
import graphql.schema.StaticDataFetcher;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import graphql.servlet.SimpleGraphQLServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import com.coxautodev.graphql.tools.GraphQLResolver;

import java.io.IOException;

import static graphql.schema.idl.RuntimeWiring.newRuntimeWiring;


@SpringBootApplication
//@Configuration
public class GraphqldemoApplication {


//	@Value("classpath:book.graphqls")
//	Resource schemaResource;
//

//	@Bean
//	ServletRegistrationBean graphQLServletRegistrationBean() throws IOException {
//		SchemaParser schemaParser = new SchemaParser();
//		TypeDefinitionRegistry typeDefinitionRegistry = schemaParser.parse(schemaResource.getFile());
//		RuntimeWiring runtimeWiring = newRuntimeWiring()
//				.type("Query",
//						builder -> builder.dataFetcher("hello", new StaticDataFetcher("world")))
//				.build();
//		SchemaGenerator schemaGenerator = new SchemaGenerator();
//		GraphQLSchema graphQLSchema = schemaGenerator.makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);
//		return new ServletRegistrationBean(SimpleGraphQLServlet.create(graphQLSchema),"/graphql");
//	}


//	@Bean
//	ServletRegistrationBean graphQLServletRegistrationBean() throws IOException {
//		GraphQLResolver graphQLResolver;
//		SchemaParser schemaParser = new SchemaParser();
//		TypeDefinitionRegistry typeDefinitionRegistry = schemaParser.parse(schemaResource.getFile());
//		RuntimeWiring runtimeWiring = newRuntimeWiring()
//				.type("Query",builder -> builder.dataFetcher("hello", new StaticDataFetcher("world")))
//				.build();
//		SchemaGenerator schemaGenerator = new SchemaGenerator();
//		GraphQLSchema graphQLSchema = schemaGenerator.makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);
//		return new ServletRegistrationBean(SimpleGraphQLServlet.create(graphQLSchema),"/graphql");
//	}


	public static void main(String[] args) {
		SpringApplication.run(GraphqldemoApplication.class, args);
	}
}
